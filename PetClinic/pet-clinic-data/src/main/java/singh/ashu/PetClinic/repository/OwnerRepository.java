package singh.ashu.PetClinic.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import singh.ashu.PetClinic.models.Owner;

public interface OwnerRepository extends JpaRepository<Owner,Long> {
}
