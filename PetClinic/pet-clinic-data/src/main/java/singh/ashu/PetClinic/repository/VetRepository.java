package singh.ashu.PetClinic.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import singh.ashu.PetClinic.models.Vet;

public interface VetRepository extends JpaRepository<Vet,Long> {
}
