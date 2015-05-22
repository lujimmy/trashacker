package org.trashacker.repository;

import org.springframework.stereotype.Repository;
import org.trashacker.domain.ClothesRecyclingBox;

/**
 * @author <a href="mailto:gn00023040@gmail.com">Jimmy Lu</a>
 * @since 15/5/22
 */
@Repository
public class ClothesRecyclingBoxRepoImpl implements ClothesRecyclingBoxRepoCustom {

    @Override
    public Iterable<ClothesRecyclingBox> getByLocationRange(float maxLat, float minLat, float maxLng, float minLng) {
        return null;
    }
}
