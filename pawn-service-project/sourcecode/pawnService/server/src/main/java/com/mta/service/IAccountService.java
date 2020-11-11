package com.mta.service;

import com.mta.entity.TblUser;
import org.springframework.stereotype.Service;

@Service
public interface IAccountService {
    String isCheckLoginAndReturnToken(TblUser user);
    Boolean logoutUser();
}
