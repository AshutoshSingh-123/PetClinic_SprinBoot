package singh.ashu.PetClinic.services.SDJService;

import org.springframework.stereotype.Service;
import singh.ashu.PetClinic.models.PetType;
import singh.ashu.PetClinic.repository.PetTypeRepository;

import java.util.List;

@Service
public class PetTypeSDJServiceImpl implements PetTypeSDJService {
    private final PetTypeRepository petTypeRepository;

    public PetTypeSDJServiceImpl(PetTypeRepository petTypeRepository) {
        this.petTypeRepository = petTypeRepository;
    }

    @Override
    public PetType save(PetType obj) {
        return petTypeRepository.save(obj);
    }

    @Override
    public PetType findById(Long id) {
        return petTypeRepository.findById(id).orElse(null);
    }

    @Override
    public List<PetType> findAll() {
        return petTypeRepository.findAll();
    }

    @Override
    public void delete(PetType obj) {
        petTypeRepository.delete(obj);

    }

    @Override
    public void deleteById(Long id) {
        petTypeRepository.deleteById(id);

    }
}
