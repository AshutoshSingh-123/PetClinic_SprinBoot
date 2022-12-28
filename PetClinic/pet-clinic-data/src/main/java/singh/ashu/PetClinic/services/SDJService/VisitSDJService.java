package singh.ashu.PetClinic.services.SDJService;

import singh.ashu.PetClinic.models.Owner;
import singh.ashu.PetClinic.models.Visit;

import java.util.List;

public interface VisitSDJService {
    Visit save(Visit obj);
    Visit findById(Long id);
    List<Visit> findAll();
    void delete(Visit obj);
    void deleteById(Long id);
}
