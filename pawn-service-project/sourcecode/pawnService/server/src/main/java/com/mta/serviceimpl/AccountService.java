package com.mta.serviceimpl;

import com.mta.dao.IAccountDao;
import com.mta.entity.TblUser;
import com.mta.jwt.JwtTokenProvider;
import com.mta.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AccountService implements IAccountService {

    private final JwtTokenProvider jwtTokenProvider;
    private final IAccountDao mIAccountDao;

    @Autowired
    public AccountService(JwtTokenProvider inJwtTokenProvider, IAccountDao inIAccountDao) {
        this.jwtTokenProvider = inJwtTokenProvider;
        this.mIAccountDao = inIAccountDao;
    }

    @Override
    public String isCheckLoginAndReturnToken(TblUser user) {
        TblUser tblUser = this.mIAccountDao.findByUsernameAndPassword(user.getUsername().trim(), user.getPassword().trim());
        if (tblUser != null) {
            String generalToken = jwtTokenProvider.generateToken(user);
            if (generalToken != null && !generalToken.isBlank()) {
                // insert token into db
                tblUser.setToken(generalToken);
                tblUser.setLastDate(user.getLastDate());
                Long id = this.mIAccountDao.save(tblUser).getUserId();
                System.out.println("id: " + id);
                return generalToken;
            } else {
                return "";
            }
        }
        return null;
    }

    @Override
    public Boolean logoutUser() {

        return false;
    }
}
