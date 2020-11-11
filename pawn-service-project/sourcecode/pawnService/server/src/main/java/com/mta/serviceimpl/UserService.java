package com.mta.serviceimpl;

import com.mta.service.IUserService;
import org.springframework.stereotype.Component;

@Component
public class UserService implements IUserService {

    @Override
    public String getProfileById(Long id) {
        return null;
    }
}
