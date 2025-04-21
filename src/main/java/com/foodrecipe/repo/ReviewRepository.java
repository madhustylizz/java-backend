package com.foodrecipe.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.foodrecipe.entity.Review;

@Repository
public interface ReviewRepository extends JpaRepository<Review, String>{
	

}
