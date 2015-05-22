package org.trashacker.controller;

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
import org.trashacker.service.SearchSesultBean;

@RestController
public class CollectPointQueryController {
	
	@Autowired
	SearchCollectPointService searchCollectPointService;

    @RequestMapping("/collectPoint/query")
    public CollectPointQueryResult greeting(@RequestParam(value="garbageType", defaultValue="all") String garbageType, 
    		@RequestParam(value="lat", required=false) String lat, @RequestParam(value="lng", required=false) String lng, @RequestParam(value="square", required=false) String square,
    		@RequestParam(value="startTime", required=false) String startTime, @RequestParam(value="endTime", required=false) String endTime) {
    	
    	SearchSesultBean searchResultBean = null;
    	if (!StringUtils.isEmpty(lat) && !StringUtils.isEmpty(lng)){
    		float latValue = Float.valueOf(lat);
    		float lngValue = Float.valueOf(lng);
    		float squareValue = StringUtils.isEmpty(square) ? Float.valueOf("0.0005") : Float.valueOf(square);
    		searchResultBean = searchCollectPointService.searchAllTypePointsByLocation(latValue + squareValue, latValue - squareValue, lngValue + squareValue, lngValue - squareValue);
    	} else if (!StringUtils.isEmpty(startTime) && !StringUtils.isEmpty(endTime)){
    		String[] start = startTime.split(":");
    		String[] end = endTime.split(":");
    		
    		searchResultBean = searchCollectPointService.searchAllTypePointsByTime(Integer.valueOf(start[0]), Integer.valueOf(start[1]), Integer.valueOf(end[0]), Integer.valueOf(end[1]));
    	}
    	
    	CollectPointQueryResult response = new CollectPointQueryResult(searchResultBean);
    	
    	StringBuilder queryParameter = new StringBuilder();
    	queryParameter.append("garbageType=").append(garbageType).append("&lat=").append(lat).append("&lng=").append(lng)
    		.append("&square=").append(square).append("&startTime=").append(startTime).append("&endTime=").append(endTime);
    	
    	response.setQueryParameters(queryParameter.toString());
    	
    	return response;
    	
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
