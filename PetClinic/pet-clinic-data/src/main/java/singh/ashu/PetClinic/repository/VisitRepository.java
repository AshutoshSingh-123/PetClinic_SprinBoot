package singh.ashu.PetClinic.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import singh.ashu.PetClinic.models.Visit;

public interface VisitRepository extends JpaRepository<Visit,Long> {
}
