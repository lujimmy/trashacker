package org.trashacker.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.trashacker.domain.GarbageTruckRoadmap;

import java.sql.Time;

/**
 * @author <a href="mailto:gn00023040@gmail.com">Jimmy Lu</a>
 * @since 15/5/22
 */
public interface GarbageTruckRoadmapRepo extends CrudRepository<GarbageTruckRoadmap, Integer>, GarbageTruckRoadmapRepoCustom {

    @Query("select g from GarbageTruckRoadmap g where g.latitude <= ?1 and g.latitude >= ?2 and g.longitude <= ?3 and g.longitude >= ?4")
    Iterable<GarbageTruckRoadmap> getByLocationRange(double maxLat, double minLat, double maxLng, double minLng);

    @Query("select g from GarbageTruckRoadmap g where g.arriveTime >= ?1 and g.leaveTime <= ?2")
    Iterable<GarbageTruckRoadmap> getByTimeRange(Time arrive, Time leave);
}
