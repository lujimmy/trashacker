package org.trashacker.repository;

import org.springframework.data.repository.CrudRepository;
import org.trashacker.domain.WedSunFoodWasteDepot;

/**
 * @author <a href="mailto:gn00023040@gmail.com">Jimmy Lu</a>
 * @since 15/5/22
 */
public interface WedSunFoodWasteDepotRepo extends CrudRepository<WedSunFoodWasteDepot, Integer>, WedSunFoodWasteDepotRepoCustom {
}
