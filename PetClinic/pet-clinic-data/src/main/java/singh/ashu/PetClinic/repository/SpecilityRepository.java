package singh.ashu.PetClinic.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import singh.ashu.PetClinic.models.Specility;

public interface SpecilityRepository extends JpaRepository<Specility,Long> {
}
