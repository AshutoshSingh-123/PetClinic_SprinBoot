package singh.ashu.PetClinic.services.SDJService;

import singh.ashu.PetClinic.models.Owner;
import singh.ashu.PetClinic.models.PetType;

import java.util.List;

public interface PetTypeSDJService {
    PetType save(PetType obj);
    PetType findById(Long id);
    List<PetType> findAll();
    void delete(PetType obj);
    void deleteById(Long id);
}
