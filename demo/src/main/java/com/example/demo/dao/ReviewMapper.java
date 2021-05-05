package com.example.demo.dao;
import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.example.demo.domain.Restaurant;
import com.example.demo.domain.Review;

@Mapper
public interface ReviewMapper {
	
	@Select("SELECT REVIEWID,CUSTEMAIL,RESTID,REVIEWTITLE,REVIEWDESCR,REVIEWDATE,RATING FROM CUST_REVIEW")
	List<Review> getReviewList();
	
	@Update("update CUST_REVIEW set reviewid=#{reviewid},custemail=#{custemail},restid=#{restid},reviewtitle=#{reviewtitle},reviewdescr=#{reviewdescr},reviewdate=#{reviewdate},rating=#{rating} where reviewid=#{reviewid}")
	void saveReview(Review review);
	
	
	@Insert("insert into CUST_REVIEW (reviewid,custemail,restid,reviewtitle,reviewdescr,rating) values(#{reviewid},#{custemail},#{restid},#{reviewtitle},#{reviewdescr},#{rating})")
	void insertReview(Review review);
}
