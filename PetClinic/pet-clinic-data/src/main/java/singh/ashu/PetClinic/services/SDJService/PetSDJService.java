package singh.ashu.PetClinic.services.SDJService;

import singh.ashu.PetClinic.models.Owner;
import singh.ashu.PetClinic.models.Pet;

import java.util.List;

public interface PetSDJService {
    Pet save(Pet obj);
    Pet findById(Long id);
    List<Pet> findAll();
    void delete(Pet obj);
    void deleteById(Long id);
}
