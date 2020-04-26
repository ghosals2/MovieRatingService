package com.example.demo.Model;

import java.util.List;

public class RatingList {
		private List<Rating> listofrating;

		public RatingList() {
		}

		public RatingList(List<Rating> listofrating) {
			this.listofrating = listofrating;
		}

		public List<Rating> getListofrating() {
			return listofrating;
		}

		public void setListofrating(List<Rating> listofrating) {
			this.listofrating = listofrating;
		}

		@Override
		public String toString() {
			return "RatingList [listofrating=" + listofrating + "]";
		}
		
		
		
}
