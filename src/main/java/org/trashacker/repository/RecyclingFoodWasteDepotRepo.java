package org.trashacker.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.trashacker.domain.RecyclingFoodWasteDepot;

/**
 * @author <a href="mailto:gn00023040@gmail.com">Jimmy Lu</a>
 * @since 15/5/22
 */
public interface RecyclingFoodWasteDepotRepo extends CrudRepository<RecyclingFoodWasteDepot, Integer>, RecyclingFoodWasteDepotRepoCustom {

    @Query("select r from RecyclingFoodWasteDepot r where r.latitude <= ?1 and r.latitude >= ?2 and r.longitude <= ?3 and r.longitude >= ?4")
    Iterable<RecyclingFoodWasteDepot> getByLocationRange(double maxLat, double minLat, double maxLng, double minLng);
}
