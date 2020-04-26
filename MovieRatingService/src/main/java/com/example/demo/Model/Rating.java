package com.example.demo.Model;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class Rating {
	private String movieId;
	private int rating;
	
	public Rating() {
	}
	public Rating(String movieId, int rating) {
		super();
		this.movieId = movieId;
		this.rating = rating;
	}
	public String getMovieId() {
		return movieId;
	}
	public void setMovieId(String movieId) {
		this.movieId = movieId;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	@Override
	public String toString() {
		return "Rating [movieId=" + movieId + ", rating=" + rating + "]";
	}
	

}
