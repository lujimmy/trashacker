package org.trashacker.data.domain;

import java.util.Arrays;
import java.util.List;

public class ClothesCollectPoint {
	
	final static public GarbageType collectType = GarbageType.CLOTHES;

	private String id;
	private String name;
	private String addressForDisplay;
	private String address;
	private float lat;
	private float lng;
	
	/* linktable : garbage_go_location*/
	private GeneralInformation generalInformation;

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

	public GeneralInformation getGeneralInformation() {
		return generalInformation;
	}

	public void setGeneralInformation(GeneralInformation generalInformation) {
		this.generalInformation = generalInformation;
	}
	
	
}
