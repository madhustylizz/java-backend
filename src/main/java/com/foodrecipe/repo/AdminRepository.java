package com.foodrecipe.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.foodrecipe.entity.Admin;

@Repository
public interface AdminRepository extends JpaRepository<Admin, String> {

    Admin findByUsername(String username);
}
