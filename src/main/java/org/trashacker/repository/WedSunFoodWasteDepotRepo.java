package org.trashacker.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.trashacker.domain.WedSunFoodWasteDepot;

/**
 * @author <a href="mailto:gn00023040@gmail.com">Jimmy Lu</a>
 * @since 15/5/22
 */
public interface WedSunFoodWasteDepotRepo extends CrudRepository<WedSunFoodWasteDepot, Integer>, WedSunFoodWasteDepotRepoCustom {

    @Query("select w from WedSunFoodWasteDepot w where w.latitude <= ?1 and w.latitude >= ?2 and w.longitude <= ?3 and w.longitude >= ?4")
    Iterable<WedSunFoodWasteDepot> getByLocationRange(double maxLat, double minLat, double maxLng, double minLng);
}
