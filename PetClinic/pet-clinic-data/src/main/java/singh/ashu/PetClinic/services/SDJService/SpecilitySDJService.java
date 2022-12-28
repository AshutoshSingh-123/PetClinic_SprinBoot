package singh.ashu.PetClinic.services.SDJService;

import singh.ashu.PetClinic.models.Owner;
import singh.ashu.PetClinic.models.Specility;

import java.util.List;

public interface SpecilitySDJService
{
    Specility save(Specility obj);
    Specility findById(Long id);
    List<Specility> findAll();
    void delete(Specility obj);
    void deleteById(Long id);
}
