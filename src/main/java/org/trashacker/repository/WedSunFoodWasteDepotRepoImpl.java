package org.trashacker.repository;

import org.springframework.stereotype.Repository;
import org.trashacker.domain.WedSunFoodWasteDepot;

/**
 * @author <a href="mailto:gn00023040@gmail.com">Jimmy Lu</a>
 * @since 15/5/22
 */
@Repository
public class WedSunFoodWasteDepotRepoImpl implements WedSunFoodWasteDepotRepoCustom {

    @Override
    public Iterable<WedSunFoodWasteDepot> getByLocationRange(float maxLat, float minLat, float maxLng, float minLng) {
        return null;
    }
}
