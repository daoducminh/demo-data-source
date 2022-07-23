package com.example.demodatasource.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demodatasource.model.entity.UserInfo;

public interface UserInfoRepository extends JpaRepository<UserInfo, Long> {

}
