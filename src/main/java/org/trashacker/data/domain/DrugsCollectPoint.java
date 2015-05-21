package org.trashacker.data.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class DrugsCollectPoint {

	final static public GarbageType GARBAGE_TYPE= GarbageType.DRUG;

	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	private String id;
	private String name;
	private String addressForDisplay;
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

	public String getAddressForDisplay() {
		return addressForDisplay;
	}

	public void setAddressForDisplay(String addressForDisplay) {
		this.addressForDisplay = addressForDisplay;
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
