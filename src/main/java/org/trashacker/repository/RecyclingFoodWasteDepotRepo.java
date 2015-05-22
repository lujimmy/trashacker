package org.trashacker.repository;

import org.springframework.data.repository.CrudRepository;
import org.trashacker.domain.RecyclingFoodWasteDepot;

/**
 * @author <a href="mailto:gn00023040@gmail.com">Jimmy Lu</a>
 * @since 15/5/22
 */
public interface RecyclingFoodWasteDepotRepo extends CrudRepository<RecyclingFoodWasteDepot, Integer>, RecyclingFoodWasteDepotRepoCustom {
}
