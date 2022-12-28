package singh.ashu.PetClinic.services.SDJService;

import org.springframework.stereotype.Service;
import singh.ashu.PetClinic.models.Pet;
import singh.ashu.PetClinic.repository.PetRepository;

import java.util.List;
@Service
public class PetSDJServiceImpl implements PetSDJService {
    private final PetRepository petRepository;


    public PetSDJServiceImpl(PetRepository petRepository) {
        this.petRepository = petRepository;


    }

    @Override
    public Pet save(Pet obj) {


        return petRepository.save(obj);
    }

    @Override
    public Pet findById(Long id) {
        return petRepository.findById(id).orElse(null);
    }

    @Override
    public List<Pet> findAll() {
        return petRepository.findAll();
    }

    @Override
    public void delete(Pet obj) {
        petRepository.delete(obj);

    }

    @Override
    public void deleteById(Long id) {
petRepository.deleteById(id);
    }
}
