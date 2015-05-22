package org.trashacker.repository;

import org.springframework.stereotype.Repository;
import org.trashacker.domain.GarbageTruckRoadmap;

/**
 * @author <a href="mailto:gn00023040@gmail.com">Jimmy Lu</a>
 * @since 15/5/22
 */
@Repository
public class GarbageTruckRoadmapRepoImpl implements GarbageTruckRoadmapRepoCustom {

	@Override
	public Iterable<GarbageTruckRoadmap> getByLocationRange(float maxLat,
			float minLat, float maxLng, float minLng) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<GarbageTruckRoadmap> getByArriveTimeRange(int startHour,
			int startmin, int endHour, int endMin) {
		// TODO Auto-generated method stub
		return null;
	}
}
