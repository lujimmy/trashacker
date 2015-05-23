package org.trashacker.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.trashacker.domain.PedestrianTrashBox;

/**
 * @author <a href="mailto:gn00023040@gmail.com">Jimmy Lu</a>
 * @since 15/5/23
 */
public interface PedestrianTrashBoxRepo extends CrudRepository<PedestrianTrashBox, Integer>, PedestrianTrashBoxRepoCustom {

    @Query("select p from PedestrianTrashBox p where p.latitude <= ?1 and p.latitude >= ?2 and p.longitude <= ?3 and p.longitude >= ?4")
    Iterable<PedestrianTrashBox> getByLocationRange(double maxLat, double minLat, double maxLng, double minLng);
}
