package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.Aggregator.RatingsAggregator;
import com.example.demo.Model.Rating;
import com.example.demo.Model.RatingList;



@RestController
@RequestMapping("/ratingsdata")
public class MovieRatingController {
	
	@Autowired
	RatingsAggregator ratingsaggregator;
	@RequestMapping("/{userId}")
	public RatingList getRating(@PathVariable("userId") String userId)   {
		System.out.println(userId);
		RatingList ratinglist=null;
		
		//Rating rating= null;
		try {
			ratinglist = ratingsaggregator.getMovieRatings(userId);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			
			e.printStackTrace();
		}
		
		return ratinglist;
		
	}
}
