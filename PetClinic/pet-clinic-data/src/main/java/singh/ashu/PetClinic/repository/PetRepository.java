package singh.ashu.PetClinic.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import singh.ashu.PetClinic.models.Pet;

public interface PetRepository extends JpaRepository<Pet,Long> {
}
