package singh.ashu.PetClinic.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import singh.ashu.PetClinic.models.Owner;

import java.util.List;

public interface OwnerRepository extends JpaRepository<Owner,Long> {
    List<Owner> findByLastNameLikeIgnoreCase(String lastName);

}
