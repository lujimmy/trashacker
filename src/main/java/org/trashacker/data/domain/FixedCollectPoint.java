package org.trashacker.data.domain;

import java.util.Arrays;
import java.util.GregorianCalendar;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/* table : recycling_food_scraps_daily */
@Entity
public class FixedCollectPoint {
	
	final static public List<GarbageType> GARBAGE_TYPES = Arrays.asList(GarbageType.GENERAL,GarbageType.FOOD_SCRAP, GarbageType.RECYCLE);
	
	final static public GregorianCalendar START_TIME = new GregorianCalendar(0,0,0,6,0);
	
	final static public GregorianCalendar END_TIME = new GregorianCalendar(0,0,0,21,0);
	
	final static public String WEEK_DAYS = "1,2,3,4,5,6,7";
	
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	private String id;
	private String name;
	private String address;
	private String phoneNum;
	private float lat;
	private float lng;

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
