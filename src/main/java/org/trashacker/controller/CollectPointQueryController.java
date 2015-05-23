package org.trashacker.controller;

import java.sql.Time;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.trashacker.controller.CollectPointQueryResult.CollectPoint;
import org.trashacker.service.SearchCollectPointService;
import org.trashacker.service.SearchResultBean;

@RestController
public class CollectPointQueryController {
	
	@Autowired
	SearchCollectPointService searchCollectPointService;

    @RequestMapping("/collectPoint/query")
    public CollectPointQueryResult queryPoint(@RequestParam(value="garbageType", defaultValue="all") String garbageType, 
    		@RequestParam(value="lat", required=false) String lat, @RequestParam(value="lng", required=false) String lng, @RequestParam(value="square", required=false) String square,
    		@RequestParam(value="startTime", defaultValue="") String startTime, @RequestParam(value="endTime", defaultValue="") String endTime) {
    	
    	SearchResultBean searchResultBean = null;
    	
    	List<String> queryTypes = this.getQueryTypes(garbageType);
		float latValue = Float.valueOf(lat);
		float lngValue = Float.valueOf(lng);
		float squareValue = StringUtils.isEmpty(square) ? Float.valueOf("0.0005") : Float.valueOf(square);
		String[] start = startTime.split(":");
		String[] end = endTime.split(":");
		
    	if (!StringUtils.isEmpty(lat) && !StringUtils.isEmpty(lng) && !StringUtils.isEmpty(startTime) && !StringUtils.isEmpty(endTime)){
    		searchResultBean = searchCollectPointService.searchByTimeAndLocation(queryTypes, latValue + squareValue, latValue - squareValue, lngValue + squareValue, lngValue - squareValue,
    				new Time(Integer.valueOf(start[0]), Integer.valueOf(start[1]),0), new Time(Integer.valueOf(end[0]), Integer.valueOf(end[1]),0));
    	} else if (!StringUtils.isEmpty(lat) && !StringUtils.isEmpty(lng)){
    		searchResultBean = searchCollectPointService.searchAllTypePointsByLocation(queryTypes,latValue + squareValue, latValue - squareValue, lngValue + squareValue, lngValue - squareValue);
    	} else if (!StringUtils.isEmpty(startTime) && !StringUtils.isEmpty(endTime)){
    		searchResultBean = searchCollectPointService.searchAllTypePointsByTime(queryTypes,new Time(Integer.valueOf(start[0]), Integer.valueOf(start[1]),0), new Time(Integer.valueOf(end[0]), Integer.valueOf(end[1]),0));
    	}
    	
    	CollectPointQueryResult response = new CollectPointQueryResult(searchResultBean);
    	
    	StringBuilder queryParameter = new StringBuilder();
    	queryParameter.append("garbageType=").append(garbageType).append("&lat=").append(lat).append("&lng=").append(lng)
    		.append("&square=").append(square).append("&startTime=").append(startTime).append("&endTime=").append(endTime);
    	
    	response.setQueryParameters(queryParameter.toString());
    	
    	return response;
    	
    }
    
    private List<String> getQueryTypes(final String garbageType){
    	
    	if (garbageType.equals("all")){
    		return Arrays.asList("general","recycle","foodScrap","drug","clothes");
    	}
    	
    	return Arrays.asList(garbageType.split(","));
    }
    
    private CollectPointQueryResult generateFakeData(String garbageType,String lat,String lng,String square,String startTime, String endTime){
    	CollectPointQueryResult result = new CollectPointQueryResult();
    	
    	result.setQueryParameters("garbageType="+garbageType+"&lat="+lat+"&lng="+lng+"&square="+square+"&startTime="+startTime+"&endTime="+endTime);
    	result.setTotalcount(1);
    	
    	List<CollectPoint> collectionPoints = new ArrayList<CollectPoint>(5);
    	
    	CollectPoint point1 = new CollectPoint();
    	point1.setDataSource("trashCars");
    	point1.setGarbageType(Arrays.asList("general","recycle","foodScrap"));
    	point1.setCarNumber("101-037");
    	point1.setAddress("AAAAAAAAAAAAAAAAAAAAAAAAAA");
    	point1.setLng("121.532895999999990");
    	point1.setLat("25.096990000000002");
    	point1.setWeekdays(Arrays.asList(1,2,4,5,6));
    	point1.setStartTime("18:00");
    	
    	collectionPoints.add(point1);
    	
    	
    	result.setCollectionPoints(collectionPoints);
    	return result;
    }
}
