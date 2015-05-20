package org.trashacker.data.domain;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

/* table : garbage_car_daily */
public class GarbageCarDaily {

	final static public List<GarbageType> collectTypes = Arrays.asList(GarbageType.GENERAL,GarbageType.FOOD_SCRAP, GarbageType.RECYCLE);

	private String id;
	private String carNo;
	private int carNumber;
	private String address;
	private float lat;
	private float lng;
	private Date arriveTime;
	
	/* linktable : garbage_go_location*/
	private GeneralInformation generalInformation;
	
	public GeneralInformation getGeneralInformation() {
		return generalInformation;
	}
	public void setGeneralInformation(GeneralInformation generalInformation) {
		this.generalInformation = generalInformation;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getCarNo() {
		return carNo;
	}
	public void setCarNo(String carNo) {
		this.carNo = carNo;
	}
	public int getCarNumber() {
		return carNumber;
	}
	public void setCarNumber(int carNumber) {
		this.carNumber = carNumber;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public float getLat() {
		return lat;
	}
	public void setLat(float lat) {
		this.lat = lat;
	}
	public float getLng() {
		return lng;
	}
	public void setLng(float lng) {
		this.lng = lng;
	}
	
	public Date getArriveTime() {
		return arriveTime;
	}
	public void setArriveTime(Date arriveTime) {
		this.arriveTime = arriveTime;
	}
	
	public int getArriveHour(){
		return this.arriveTime.getHours();
	}
	
	public int getArriveMinutes(){
		return this.arriveTime.getMinutes();
	}
	
	
}
