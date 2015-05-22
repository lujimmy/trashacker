package org.trashacker.service;

import java.sql.Time;
import java.util.GregorianCalendar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.trashacker.data.domain.PointType;
import org.trashacker.repository.ClothesRecyclingBoxRepo;
import org.trashacker.repository.GarbageTruckRoadmapRepo;
import org.trashacker.repository.MedicationDisposalSiteRepo;
import org.trashacker.repository.RecyclingFoodWasteDepotRepo;
import org.trashacker.repository.WedSunFoodWasteDepotRepo;

@Service
public class SearchCollectPointService {
	
	@Autowired
	ClothesRecyclingBoxRepo clothesRecyclingBoxRepo;
	
	@Autowired
	MedicationDisposalSiteRepo medicationDisposalSiteRepo;
	
	@Autowired
	RecyclingFoodWasteDepotRepo recyclingFoodWasteDepotRepo;
	
	@Autowired
	WedSunFoodWasteDepotRepo wedSunFoodWasteDepotRepo;
	
	@Autowired
	GarbageTruckRoadmapRepo garbageTruckRoadmapRepo;

	public SearchResultBean searchAllTypePointsByLocation(float maxLat, float minLat, float maxLng, float minLng){
		SearchResultBean result = new SearchResultBean();
		
		result.setClothesPoints(clothesRecyclingBoxRepo.getByLocationRange(maxLat, minLat, maxLng, minLng));
		result.setDrugsPoints(medicationDisposalSiteRepo.getByLocationRange(maxLat, minLat, maxLng, minLng));
		result.setFixedPoints(recyclingFoodWasteDepotRepo.getByLocationRange(maxLat, minLat, maxLng, minLng));
		result.setFoodScrapsPoints(wedSunFoodWasteDepotRepo.getByLocationRange(maxLat, minLat, maxLng, minLng));
		result.setGarbageCar(garbageTruckRoadmapRepo.getByLocationRange(maxLat, minLat, maxLng, minLng));
		
		return result;
	}
	
	public SearchResultBean searchAllTypePointsByTime(Time arrive, Time leave){
		SearchResultBean result = new SearchResultBean();
		
		result.setGarbageCar(garbageTruckRoadmapRepo.getByTimeRange(arrive, leave));
		
		GregorianCalendar queryStartTime = new GregorianCalendar(0,0,0,arrive.toLocalTime().getHour(),leave.toLocalTime().getHour());

		if (queryStartTime.after(PointType.FIXED_POINT.getStartTime()) && queryStartTime.before(PointType.FIXED_POINT.getEndTime())){
			result.setFixedPoints(recyclingFoodWasteDepotRepo.findAll());
		}
		
		if (queryStartTime.after(PointType.FOOD_SCRAPS_ONLY_POINT.getStartTime()) && queryStartTime.before(PointType.FOOD_SCRAPS_ONLY_POINT.getEndTime())){
			result.setFoodScrapsPoints(wedSunFoodWasteDepotRepo.findAll());
		}
		
		return result;
	}
}
