package org.trashacker.repository;

import org.trashacker.domain.GarbageTruckRoadmap;

/**
 * @author <a href="mailto:gn00023040@gmail.com">Jimmy Lu</a>
 * @since 15/5/22
 */
public interface GarbageTruckRoadmapRepoCustom {
	
	Iterable<GarbageTruckRoadmap> getByLocationRange(float maxLat, float minLat, float maxLng, float minLng);
	
	Iterable<GarbageTruckRoadmap> getByArriveTimeRange(int startHour, int startmin, int endHour, int endMin);
}
