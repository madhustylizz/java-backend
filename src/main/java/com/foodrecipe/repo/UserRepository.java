package com.foodrecipe.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.foodrecipe.entity.User;



public interface UserRepository extends JpaRepository<User, Integer> {

    User findUserByEmail(String email);

}
