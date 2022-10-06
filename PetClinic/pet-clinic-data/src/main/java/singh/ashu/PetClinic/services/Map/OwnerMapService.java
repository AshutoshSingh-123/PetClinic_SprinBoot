package singh.ashu.PetClinic.services.Map;

import org.springframework.stereotype.Service;
import singh.ashu.PetClinic.models.Owner;
import singh.ashu.PetClinic.services.CrudService;

import java.util.Set;

@Service
public class OwnerMapService extends AbstractMapService<Owner,Long> implements CrudService<Owner,Long> {
    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
         super.deleteById(id);
    }

    @Override
    public void delete(Owner object) {
            super.delete(object);
    }

    @Override
    public Owner save(Owner object) {
        return super.save(object.getId(),object);
    }

    @Override
    public Owner findById(Long id) {
        return super.findById(id);
    }
}