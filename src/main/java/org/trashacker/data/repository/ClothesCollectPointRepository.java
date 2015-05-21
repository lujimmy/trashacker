package org.trashacker.data.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.trashacker.data.domain.ClothesCollectPoint;

@Repository
public interface ClothesCollectPointRepository extends CrudRepository<ClothesCollectPoint,String>{

}
