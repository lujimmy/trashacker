package org.trashacker.repository;

import org.springframework.stereotype.Repository;
import org.trashacker.domain.MedicationDisposalSite;

/**
 * @author <a href="mailto:gn00023040@gmail.com">Jimmy Lu</a>
 * @since 15/5/22
 */
@Repository
public class MedicationDisposalSiteRepoImpl implements MedicationDisposalSiteRepoCustom {

	@Override
	public Iterable<MedicationDisposalSite> getByLocationRange(float maxLat,
			float minLat, float maxLng, float minLng) {
		// TODO Auto-generated method stub
		return null;
	}
}
