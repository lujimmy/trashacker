package org.trashacker.data.domain;

public enum GarbageType {
	GENERAL("general"),
	RECYCLE("recycle"),
	CLOTHES("clothes"),
	DRUG("drug"),
	FOOD_SCRAP("foodScrap");
	
	private final String name;
	
	GarbageType(String name){
		this.name = name;
	}
	
	public String getName(){
		return this.name;
	}
}
