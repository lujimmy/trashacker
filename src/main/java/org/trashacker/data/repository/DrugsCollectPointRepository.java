package org.trashacker.data.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.trashacker.data.domain.ClothesCollectPoint;
import org.trashacker.data.domain.DrugsCollectPoint;

@Repository
public interface DrugsCollectPointRepository extends CrudRepository<DrugsCollectPoint,String>{

}
