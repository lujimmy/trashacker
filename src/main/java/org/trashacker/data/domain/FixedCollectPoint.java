package org.trashacker.data.domain;

import java.util.Arrays;
import java.util.List;

/* table : recycling_food_scraps_daily */
public class FixedCollectPoint {
	
	final static public List<GarbageType> collectTypes = Arrays.asList(GarbageType.GENERAL,GarbageType.FOOD_SCRAP, GarbageType.RECYCLE);
	
	private String id;
	private String name;
	private String address;
	private String phoneNum;
	private float lat;
	private float lng;
	
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
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhoneNum() {
		return phoneNum;
	}
	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
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
}
