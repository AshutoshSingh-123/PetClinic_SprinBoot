package singh.ashu.PetClinic.services.SDJService;

import org.springframework.stereotype.Service;
import singh.ashu.PetClinic.models.Specility;
import singh.ashu.PetClinic.repository.SpecilityRepository;

import java.util.List;

@Service
public class SpecilitySDJServiceImpl implements SpecilitySDJService {
    private final SpecilityRepository specilityRepository;

    public SpecilitySDJServiceImpl(SpecilityRepository specilityRepository) {
        this.specilityRepository = specilityRepository;
    }

    @Override
    public Specility save(Specility obj) {
        return specilityRepository.save(obj);
    }

    @Override
    public Specility findById(Long id) {
        return specilityRepository.findById(id).orElse(null);
    }

    @Override
    public List<Specility> findAll() {
        return specilityRepository.findAll();
    }

    @Override
    public void delete(Specility obj) {
        specilityRepository.delete(obj);

    }

    @Override
    public void deleteById(Long id) {
        specilityRepository.deleteById(id);

    }
}
