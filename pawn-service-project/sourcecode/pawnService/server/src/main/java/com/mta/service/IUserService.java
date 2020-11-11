package com.mta.service;

import org.springframework.stereotype.Service;

@Service
public interface IUserService {
    public String getProfileById(Long id);
}
