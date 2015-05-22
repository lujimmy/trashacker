package org.trashacker.repository;

import org.trashacker.domain.MedicationDisposalSite;

/**
 * @author <a href="mailto:gn00023040@gmail.com">Jimmy Lu</a>
 * @since 15/5/22
 */
public interface MedicationDisposalSiteRepoCustom {
	
	Iterable<MedicationDisposalSite> getByLocationRange(float maxLat, float minLat, float maxLng, float minLng);
}
