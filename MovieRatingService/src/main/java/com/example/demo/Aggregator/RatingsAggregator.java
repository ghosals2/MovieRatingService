package com.example.demo.Aggregator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.example.demo.Model.Rating;
import com.example.demo.Model.RatingList;
import com.example.demo.Model.UserMapping;

@Service
public class RatingsAggregator {
	
	
	
	@Value("${movieproperty}")
	String movieproperties;
	
	
	
	
	public RatingList getMovieRatings(String userId)throws Exception
	{
		RatingList finallist=new RatingList();
		List<Rating> ratinglist=new ArrayList<Rating>();
		List<UserMapping> usermappinglist=new ArrayList<>();
		Map<String,Integer> moviemap=new HashMap<String,Integer>();
		moviemap.put("s1",4);
		moviemap.put("s2",5);
		moviemap.put("s3",3);
		moviemap.put("s4",2);
		moviemap.put("s5",1);
		/*Map<String, String> usermap=new HashMap<String, String>();
		usermap.put("u1", "s1");
		usermap.put("u2", "s2");
		usermap.put("u3", "s3");
		usermap.put("u4", "s4");
		usermap.put("u5", "s5");
		
		
		System.out.println(usermap.toString());*/
		System.out.println(movieproperties);
		
		StringTokenizer st=new StringTokenizer(movieproperties,",");
		while(st.hasMoreElements()) {
			String[] um=st.nextToken().split("-");
			UserMapping usermapping= new UserMapping(um[0],um[1]);
			//System.out.println(usermapping);
			usermappinglist.add(usermapping);
			
			
		}
		System.out.println(usermappinglist);
		
		if(null!=userId)
		{
			for(int i=0;i<usermappinglist.size();i++) {
				if(usermappinglist.get(i).getUserId().equals(userId)) {
					Rating rating=new Rating();
					rating.setMovieId(usermappinglist.get(i).getMovieId());
					rating.setRating(moviemap.get(usermappinglist.get(i).getMovieId()));
					ratinglist.add(rating);
					
					System.out.println(ratinglist);
					
				}
				
			}
		}
		
		
		/*if(null!=userId&&usermap.containsKey(userId)) {
			rating.setMovieId(usermap.get(userId));
			rating.setRating(moviemap.get(usermap.get(userId)));
		}*/
		else
			throw new Exception();
		//ratinglist.add(rating);
		finallist.setListofrating(ratinglist);
		
		
		return finallist;
	}
}
