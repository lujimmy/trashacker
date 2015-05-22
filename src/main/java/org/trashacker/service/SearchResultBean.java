package org.trashacker.service;

import org.trashacker.domain.ClothesRecyclingBox;
import org.trashacker.domain.GarbageTruckRoadmap;
import org.trashacker.domain.MedicationDisposalSite;
import org.trashacker.domain.RecyclingFoodWasteDepot;
import org.trashacker.domain.WedSunFoodWasteDepot;

public class SearchResultBean {

	private Iterable<ClothesRecyclingBox> clothesPoints;
	private Iterable<MedicationDisposalSite> drugsPoints;
	private Iterable<RecyclingFoodWasteDepot> fixedPoints;
	private Iterable<WedSunFoodWasteDepot> foodScrapsPoints;
	private Iterable<GarbageTruckRoadmap> garbageCar;
	
	public Iterable<ClothesRecyclingBox> getClothesPoints() {
		return clothesPoints;
	}
	public void setClothesPoints(Iterable<ClothesRecyclingBox> clothesPoints) {
		this.clothesPoints = clothesPoints;
	}
	public Iterable<MedicationDisposalSite> getDrugsPoints() {
		return drugsPoints;
	}
	public void setDrugsPoints(Iterable<MedicationDisposalSite> drugsPoints) {
		this.drugsPoints = drugsPoints;
	}
	public Iterable<RecyclingFoodWasteDepot> getFixedPoints() {
		return fixedPoints;
	}
	public void setFixedPoints(Iterable<RecyclingFoodWasteDepot> fixedPoints) {
		this.fixedPoints = fixedPoints;
	}
	public Iterable<WedSunFoodWasteDepot> getFoodScrapsPoints() {
		return foodScrapsPoints;
	}
	public void setFoodScrapsPoints(Iterable<WedSunFoodWasteDepot> foodScrapsPoints) {
		this.foodScrapsPoints = foodScrapsPoints;
	}
	public Iterable<GarbageTruckRoadmap> getGarbageCar() {
		return garbageCar;
	}
	public void setGarbageCar(Iterable<GarbageTruckRoadmap> garbageCar) {
		this.garbageCar = garbageCar;
	}
	
}
