package org.trashacker.repository;

import org.trashacker.domain.WedSunFoodWasteDepot;

/**
 * @author <a href="mailto:gn00023040@gmail.com">Jimmy Lu</a>
 * @since 15/5/22
 */
public interface WedSunFoodWasteDepotRepoCustom {

    Iterable<WedSunFoodWasteDepot> getByLocationRange(float maxLat, float minLat, float maxLng, float minLng);
}
