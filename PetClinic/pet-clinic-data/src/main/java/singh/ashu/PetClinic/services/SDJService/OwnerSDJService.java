package singh.ashu.PetClinic.services.SDJService;

import singh.ashu.PetClinic.models.Owner;

import java.util.List;

public interface OwnerSDJService {
    Owner save(Owner obj);
    Owner findById(Long id);
    List<Owner> findAll();
    void delete(Owner obj);
    void deleteById(Long id);

    List<Owner> findByLastNameLikeIgnoreCase(String lastName);

}
