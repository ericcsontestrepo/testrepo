package com.nekadar.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nekadar.app.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
