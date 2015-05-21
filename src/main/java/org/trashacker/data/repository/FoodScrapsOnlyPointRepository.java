package org.trashacker.data.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.trashacker.data.domain.ClothesCollectPoint;
import org.trashacker.data.domain.DrugsCollectPoint;
import org.trashacker.data.domain.FixedCollectPoint;

@Repository
public interface FoodScrapsOnlyPointRepository extends CrudRepository<FixedCollectPoint,String>{

}
