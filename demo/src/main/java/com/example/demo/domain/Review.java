package com.example.demo.domain;


public class Review {
	
	int reviewid;
	String custemail;
	int restid;
	String reviewtitle;
	String reviewdescr;
	String reviewdate;
	int rating;
	
	public Review() {
		
	}
	
	public Review(int reviewid,String custemail,int restid, String reviewtitle, String reviewdescr,String reviewdate, int rating) {
		super();
		this.reviewid = reviewid;
		this.custemail = custemail;
		this.restid = restid;
		this.reviewtitle = reviewtitle;
		this.reviewdescr = reviewdescr;
		this.rating = rating;
	}

	public int getReviewid() {
		return reviewid;
	}

	public void setReviewid(int reviewid) {
		this.reviewid = reviewid;
	}

	public String getCustemail() {
		return custemail;
	}

	public void setCustemail(String custemail) {
		this.custemail = custemail;
	}

	public int getRestid() {
		return restid;
	}

	public void setRestid(int restid) {
		this.restid = restid;
	}

	public String getReviewtitle() {
		return reviewtitle;
	}

	public void setReviewtitle(String reviewtitle) {
		this.reviewtitle = reviewtitle;
	}

	public String getReviewdescr() {
		return reviewdescr;
	}

	public void setReviewdescr(String reviewdescr) {
		this.reviewdescr = reviewdescr;
	}

	public String getReviewdate() {
		return reviewdate;
	}

	public void setReviewdate(String reviewdate) {
		this.reviewdate = reviewdate;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	@Override
	public String toString() {
		return "Review [reviewid=" + reviewid + ", custemail=" + custemail + ", restid=" + restid + ", reviewtitle="
				+ reviewtitle + ", reviewdescr=" + reviewdescr + ", reviewdate=" + reviewdate + ", rating=" + rating
				+ "]";
	}

	
	
	
	

}
