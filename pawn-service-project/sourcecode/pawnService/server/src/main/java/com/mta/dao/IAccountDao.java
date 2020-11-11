package com.mta.dao;

import com.mta.entity.TblUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IAccountDao extends JpaRepository<TblUser, Long> {
    List<TblUser> findAll();
    TblUser findByUsernameAndPassword(String username, String password);
}
