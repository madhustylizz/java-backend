package com.foodrecipe.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.foodrecipe.entity.Review;
import com.foodrecipe.repo.ReviewRepository;

@Service
public class ReviewService {

	@Autowired
	ReviewRepository reviewrepo;
	
	public Review save(Review review){
		return reviewrepo.save(review);
		
	}
	public List<Review> getAllreview() {
		return reviewrepo.findAll();
	}

	
}
