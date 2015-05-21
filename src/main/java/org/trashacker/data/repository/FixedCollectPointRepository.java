package org.trashacker.data.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.trashacker.data.domain.ClothesCollectPoint;
import org.trashacker.data.domain.DrugsCollectPoint;
import org.trashacker.data.domain.FixedCollectPoint;
import org.trashacker.data.domain.FoodScrapsOnlyPoint;
import org.trashacker.data.domain.GarbageCarDaily;

@Repository
public interface FixedCollectPointRepository extends CrudRepository<GarbageCarDaily,String>{

}
