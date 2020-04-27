package com.example.demo.Model;

import org.springframework.stereotype.Service;

@Service
public class UserMapping {
	private String userId;
	private String movieId;
	
	public UserMapping() {
	}

	public UserMapping(String userId, String movieId) {
		super();
		this.userId = userId;
		this.movieId = movieId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getMovieId() {
		return movieId;
	}

	public void setMovieId(String movieId) {
		this.movieId = movieId;
	}

	@Override
	public String toString() {
		return "UserMapping [userId=" + userId + ", movieId=" + movieId + "]";
	}
	
	
	
}
