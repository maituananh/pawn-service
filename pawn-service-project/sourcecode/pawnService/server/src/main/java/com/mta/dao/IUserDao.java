package com.mta.dao;

import com.mta.entity.TblUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserDao extends JpaRepository<TblUser, Long> {

}
