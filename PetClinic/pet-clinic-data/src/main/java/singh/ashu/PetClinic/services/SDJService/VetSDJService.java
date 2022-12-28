package singh.ashu.PetClinic.services.SDJService;

import singh.ashu.PetClinic.models.Owner;
import singh.ashu.PetClinic.models.Vet;

import java.util.List;

public interface VetSDJService {
    Vet save(Vet obj);

    Vet findById(Long id);
    List<Vet> findAll();
    void delete(Vet obj);
    void deleteById(Long id);
}
