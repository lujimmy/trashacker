package org.trashacker.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.trashacker.domain.MedicationDisposalSite;

/**
 * @author <a href="mailto:gn00023040@gmail.com">Jimmy Lu</a>
 * @since 15/5/22
 */
public interface MedicationDisposalSiteRepo extends CrudRepository<MedicationDisposalSite, Integer>, MedicationDisposalSiteRepoCustom {
    
    @Query("select m from MedicationDisposalSite m where  m.latitude <= ?1 and m.latitude >= ?2 and m.longitude <= ?3 and m.longitude >= ?4")
    Iterable<MedicationDisposalSite> getByLocationRange(double maxLat, double minLat, double maxLng, double minLng);
}
