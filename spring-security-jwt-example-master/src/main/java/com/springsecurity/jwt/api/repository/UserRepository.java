package com.springsecurity.jwt.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.springsecurity.jwt.api.entity.User;

public interface UserRepository extends JpaRepository<User,Integer> {
    User findByUserName(String username);
}
