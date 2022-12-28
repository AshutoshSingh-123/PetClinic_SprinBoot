package singh.ashu.PetClinic.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import singh.ashu.PetClinic.models.PetType;

public interface PetTypeRepository extends JpaRepository<PetType,Long> {
}
