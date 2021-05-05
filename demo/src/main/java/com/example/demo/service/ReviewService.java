package com.example.demo.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.dao.RestaurantDAO;
import com.example.demo.dao.ReviewDAO;
import com.example.demo.domain.Review;

@Component
public class ReviewService {
	
	@Autowired
	ReviewDAO reviewDAO;
	
	public List<Review> getReviewList() {
		
		return reviewDAO.getReviewList();
	}
	
	public void saveReview(Review review) {
		reviewDAO.saveReview(review);
	}
	public void insertReview(Review review) {
		reviewDAO.insertReview(review);
	}

}
