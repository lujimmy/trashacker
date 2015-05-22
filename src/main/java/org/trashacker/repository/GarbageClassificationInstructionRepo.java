package org.trashacker.repository;

import org.springframework.data.repository.CrudRepository;
import org.trashacker.domain.GarbageClssificationInstruction;

/**
 * @author <a href="mailto:gn00023040@gmail.com">Jimmy Lu</a>
 * @since 15/5/22
 */
public interface GarbageClassificationInstructionRepo extends CrudRepository<GarbageClssificationInstruction, Integer>, GarbageClassificationInstructionRepoCustom {
}
