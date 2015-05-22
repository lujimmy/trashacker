package org.trashacker.repository;

import org.springframework.data.repository.CrudRepository;
import org.trashacker.domain.MedicationDisposalSite;

/**
 * @author <a href="mailto:gn00023040@gmail.com">Jimmy Lu</a>
 * @since 15/5/22
 */
public interface MedicationDisposalSiteRepo extends CrudRepository<MedicationDisposalSite, Integer>, MedicationDisposalSiteRepoCustom {
}
