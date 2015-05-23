package org.trashacker.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.springframework.util.StringUtils;
import org.trashacker.domain.ClothesRecyclingBox;
import org.trashacker.domain.GarbageTruckRoadmap;
import org.trashacker.domain.MedicationDisposalSite;
import org.trashacker.domain.PedestrianTrashBox;
import org.trashacker.domain.RecyclingFoodWasteDepot;
import org.trashacker.domain.WedSunFoodWasteDepot;
import org.trashacker.service.SearchResultBean;

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
	private int totalcount = 0;
	private List<CollectPoint> collectionPoints = new ArrayList<CollectPoint>(1);
	
	public CollectPointQueryResult(){
		
	}
	
	public CollectPointQueryResult(SearchResultBean searchSesultBean){
		if (searchSesultBean != null){
			this.loadData(searchSesultBean);
		}
	}
	
	private void loadData(SearchResultBean searchSesultBean){
		
		if (searchSesultBean.getGarbageCar() != null){
			Iterator<GarbageTruckRoadmap> trashCars = searchSesultBean.getGarbageCar().iterator();
			while (trashCars.hasNext()){
				GarbageTruckRoadmap itr = trashCars.next();
				CollectPoint aPoint = new CollectPoint();
				aPoint.setDataSource("trashCars");				
				aPoint.setGarbageType(Arrays.asList("general","recycle","foodScrap"));
				aPoint.setCarNumber(itr.getTruckId());
				aPoint.setAddress(itr.getAddress());
				aPoint.setLng(String.valueOf(itr.getLongitude()));
				aPoint.setLat(String.valueOf(itr.getLatitude()));
				aPoint.setWeekdays(Arrays.asList(1,2,4,5,6));
				
				String arriveTime = itr.getArriveTime() == null ? "" :itr.getArriveTime().toString();
				
				aPoint.setStartTime(arriveTime.substring(0, arriveTime.lastIndexOf(":")));
				
				String leaveTime = itr.getLeaveTime() == null ? "" :itr.getLeaveTime().toString();
				
				aPoint.setEndTime(leaveTime.substring(0, leaveTime.lastIndexOf(":")));
				
				collectionPoints.add(aPoint);
				totalcount++;
			}
		}
		
		if (searchSesultBean.getFixedPoints() != null){
			Iterator<RecyclingFoodWasteDepot> fixedPoints = searchSesultBean.getFixedPoints().iterator();
			while (fixedPoints.hasNext()){
				RecyclingFoodWasteDepot itr = fixedPoints.next();
				CollectPoint aPoint = new CollectPoint();
				aPoint.setDataSource("fixedPoints");				
				aPoint.setGarbageType(Arrays.asList("general","recycle","foodScrap"));
				aPoint.setName(itr.getBranch());
				aPoint.setAddress(itr.getAddress());
				aPoint.setLng(String.valueOf(itr.getLongitude()));
				aPoint.setLat(String.valueOf(itr.getLatitude()));
				aPoint.setWeekdays(Arrays.asList(1,2,3,4,5,6,7));
				aPoint.setStartTime("06:00");
				aPoint.setEndTime("23:00");
				aPoint.setInformation("Phone : "+itr.getPhone());
				
				collectionPoints.add(aPoint);
				totalcount++;
			}
		}
		
		if (searchSesultBean.getFoodScrapsPoints() != null){
			Iterator<WedSunFoodWasteDepot> foodScrapsPoints = searchSesultBean.getFoodScrapsPoints().iterator();
			while (foodScrapsPoints.hasNext()){
				WedSunFoodWasteDepot itr = foodScrapsPoints.next();
				CollectPoint aPoint = new CollectPoint();
				aPoint.setDataSource("foodScrapsPoints");				
				aPoint.setGarbageType(Arrays.asList("foodScrap"));
				aPoint.setName(itr.getRegion()+"-"+itr.getBranch());
				aPoint.setAddress(itr.getAddress());
				aPoint.setLng(String.valueOf(itr.getLongitude()));
				aPoint.setLat(String.valueOf(itr.getLatitude()));
				aPoint.setWeekdays(Arrays.asList(3,7));
				aPoint.setStartTime("18:00");
				aPoint.setEndTime("21:00");
				
				collectionPoints.add(aPoint);
				totalcount++;
			}
		}
		
		if (searchSesultBean.getDrugsPoints() != null){
			Iterator<MedicationDisposalSite> drugsPoints = searchSesultBean.getDrugsPoints().iterator();
			while (drugsPoints.hasNext()){
				MedicationDisposalSite itr = drugsPoints.next();
				CollectPoint aPoint = new CollectPoint();
				aPoint.setDataSource("drugsPoints");				
				aPoint.setGarbageType(Arrays.asList("drug"));
				aPoint.setName(itr.getName());
				aPoint.setAddress(itr.getAddress());
				aPoint.setLng(String.valueOf(itr.getLongitude()));
				aPoint.setLat(String.valueOf(itr.getLatitude()));
				
				aPoint.setInformation("Phone : "+itr.getPhone());
				
				collectionPoints.add(aPoint);
				totalcount++;
			}
		}
		
		if (searchSesultBean.getClothesPoints() != null){
			Iterator<ClothesRecyclingBox> clothesPoints = searchSesultBean.getClothesPoints().iterator();
			while (clothesPoints.hasNext()){
				ClothesRecyclingBox itr = clothesPoints.next();
				CollectPoint aPoint = new CollectPoint();
				aPoint.setDataSource("clothesBox");				
				aPoint.setGarbageType(Arrays.asList("clothes"));
				aPoint.setName(itr.getOrganization());
				aPoint.setAddress(itr.getAddress());
				aPoint.setLng(String.valueOf(itr.getLongitude()));
				aPoint.setLat(String.valueOf(itr.getLatitude()));
				
				collectionPoints.add(aPoint);
				totalcount++;
			}
		}
		
		if (searchSesultBean.getTrashBoxs() != null){
			Iterator<PedestrianTrashBox> clothesPoints = searchSesultBean.getTrashBoxs().iterator();
			while (clothesPoints.hasNext()){
				PedestrianTrashBox itr = clothesPoints.next();
				CollectPoint aPoint = new CollectPoint();
				aPoint.setDataSource("trashBox");				
				aPoint.setGarbageType(Arrays.asList("trashBox"));
				aPoint.setAddress(itr.getAddress());
				aPoint.setLng(String.valueOf(itr.getLongitude()));
				aPoint.setLat(String.valueOf(itr.getLatitude()));
				
				collectionPoints.add(aPoint);
				totalcount++;
			}
		}
	}
	
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
