package org.trashacker.data.domain;

import java.util.GregorianCalendar;

public enum PointType {
	TRASH_CAR("trashCar","",null,null,"1,2,4,5,6"),
	FIXED_POINT("fixedPoint","",new GregorianCalendar(0,0,0,6,0),new GregorianCalendar(0,0,0,23,0),"1,2,3,4,5,6,7"),
	FOOD_SCRAPS_ONLY_POINT("foodScrapsPoint","",new GregorianCalendar(0,0,0,18,0),new GregorianCalendar(0,0,0,21,0),"3,7"),
	DRUG_POINT("drugsPoint","",null,null,""),
	CLOTHES_BOX("clothesBox","",null,null,"");
	
	private String name;
	private String description;
	private GregorianCalendar startTime;
	private GregorianCalendar endTime;
	private String weekDays;
	
	PointType(String name, String description, GregorianCalendar startTime, GregorianCalendar endTime, String weekDays){
		this.name = name;
		this.description = description;
		this.startTime = startTime;
		this.endTime = endTime;
		this.weekDays = weekDays;
	}

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	public GregorianCalendar getStartTime() {
		return startTime;
	}

	public GregorianCalendar getEndTime() {
		return endTime;
	}

	public String getWeekDays() {
		return weekDays;
	}
	
}
