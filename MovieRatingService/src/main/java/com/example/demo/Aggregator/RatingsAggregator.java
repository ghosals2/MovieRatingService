package com.example.demo.Aggregator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.Rating;
import com.example.demo.Model.RatingList;

@Service
public class RatingsAggregator {
	
	@Autowired
	Rating rating;
	
	public RatingList getMovieRatings(String userId)throws Exception
	{
		RatingList finallist=new RatingList();
		List<Rating> ratinglist=new ArrayList<Rating>();
		Map<String,Integer> moviemap=new HashMap<String,Integer>();
		moviemap.put("s1",4);
		moviemap.put("s2",5);
		moviemap.put("s3",3);
		moviemap.put("s4",2);
		moviemap.put("s5",1);
		Map<String, String> usermap=new HashMap<String, String>();
		usermap.put("u1", "s1");
		usermap.put("u2", "s2");
		usermap.put("u3", "s3");
		usermap.put("u4", "s4");
		usermap.put("u5", "s5");
		
		
		System.out.println(usermap.toString());
		
		
		if(null!=userId&&usermap.containsKey(userId)) {
			rating.setMovieId(usermap.get(userId));
			rating.setRating(moviemap.get(usermap.get(userId)));
		}
		else
			throw new Exception();
		ratinglist.add(rating);
		finallist.setListofrating(ratinglist);
		
		return finallist;
	}
}
