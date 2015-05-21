package org.trashacker.data.domain;

import java.util.GregorianCalendar;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/* table : food_scraps  */
@Entity
public class FoodScrapsOnlyPoint {
	
	final static public GarbageType GARBAGE_TYPE = GarbageType.FOOD_SCRAP;
	
	final static public GregorianCalendar START_TIME = new GregorianCalendar(0,0,0,18,0);
	
	final static public GregorianCalendar END_TIME = new GregorianCalendar(0,0,0,21,0);
	
	final static public String WEEK_DAYS = "3,7";
	
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	private String id;
	private String name;
	private String address;
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
