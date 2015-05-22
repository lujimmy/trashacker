package org.trashacker.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.trashacker.domain.ClothesRecyclingBox;

/**
 * @author <a href="mailto:gn00023040@gmail.com">Jimmy Lu</a>
 * @since 15/5/22
 */
public interface ClothesRecyclingBoxRepo extends CrudRepository<ClothesRecyclingBox, Integer>, ClothesRecyclingBoxRepoCustom {

    @Query("select c from ClothesRecyclingBox c where c.latitude <= ?1 and c.latitude >= ?2 and c.longitude <= ?3 and c.longitude >= ?4")
    Iterable<ClothesRecyclingBox> getByLocationRange(double maxLat, double minLat, double maxLng, double minLng);
}
