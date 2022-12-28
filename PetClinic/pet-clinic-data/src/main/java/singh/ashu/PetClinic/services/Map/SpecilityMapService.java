package singh.ashu.PetClinic.services.Map;

import org.springframework.stereotype.Service;
import singh.ashu.PetClinic.models.Specility;
import singh.ashu.PetClinic.services.SpecilitiesService;

import java.util.Set;
@Service
public class SpecilityMapService extends AbstractMapService<Specility,Long> implements SpecilitiesService {
    @Override
    public Set<Specility> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);

    }

    @Override
    public void delete(Specility object) {
super.delete(object);
    }

    @Override
    public Specility save(Specility object) {
        return super.save(object);
    }

    @Override
    public Specility findById(Long id) {
        return super.findById(id);
    }
}
