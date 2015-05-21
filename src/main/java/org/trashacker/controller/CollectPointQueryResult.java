package org.trashacker.controller;

import java.util.ArrayList;
import java.util.List;

public class CollectPointQueryResult {
	
	public static class CollectPoint{

		private String dataSource;
		private List<String> garbageType;
		private String name;
		private String carNumber;
		private String address;
		private String lng;
		private String lat;
		private List<Integer> weekdays = new ArrayList<Integer>(1);
		private String startTime;
		private String endTime;
		private String information;
		
		public String getDataSource() {
			return dataSource;
		}
		public void setDataSource(String dataSource) {
			this.dataSource = dataSource;
		}
		public List<String> getGarbageType() {
			return garbageType;
		}
		public void setGarbageType(List<String> garbageType) {
			this.garbageType = garbageType;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getCarNumber() {
			return carNumber;
		}
		public void setCarNumber(String carNumber) {
			this.carNumber = carNumber;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public String getLng() {
			return lng;
		}
		public void setLng(String lng) {
			this.lng = lng;
		}
		public String getLat() {
			return lat;
		}
		public void setLat(String lat) {
			this.lat = lat;
		}
		public List<Integer> getWeekdays() {
			return weekdays;
		}
		public void setWeekdays(List<Integer> weekdays) {
			this.weekdays = weekdays;
		}
		public String getStartTime() {
			return startTime;
		}
		public void setStartTime(String startTime) {
			this.startTime = startTime;
		}
		public String getEndTime() {
			return endTime;
		}
		public void setEndTime(String endTime) {
			this.endTime = endTime;
		}
		public String getInformation() {
			return information;
		}
		public void setInformation(String information) {
			this.information = information;
		}
		
	}

	private String queryParameters;
	private int totalcount;
	private List<CollectPoint> collectionPoints = new ArrayList<CollectPoint>(1);
	
	public String getQueryParameters() {
		return queryParameters;
	}
	public void setQueryParameters(String queryParameters) {
		this.queryParameters = queryParameters;
	}
	public int getTotalcount() {
		return totalcount;
	}
	public void setTotalcount(int totalcount) {
		this.totalcount = totalcount;
	}
	public List<CollectPoint> getCollectionPoints() {
		return collectionPoints;
	}
	public void setCollectionPoints(List<CollectPoint> collectionPoints) {
		this.collectionPoints = collectionPoints;
	}
	
}
