package singh.ashu.PetClinic.services.SDJService;

import org.springframework.stereotype.Service;
import singh.ashu.PetClinic.models.Vet;
import singh.ashu.PetClinic.repository.VetRepository;

import java.util.List;

@Service
public class VetSDJServiceImpl implements VetSDJService {
    private final VetRepository vetRepository;

    public VetSDJServiceImpl(VetRepository vetRepository) {
        this.vetRepository = vetRepository;
    }


    @Override
    public Vet save(Vet obj) {
        return vetRepository.save(obj);
    }

    @Override
    public Vet findById(Long id) {
        return vetRepository.findById(id).orElse(null);
    }

    @Override
    public List<Vet> findAll() {
        return vetRepository.findAll();
    }

    @Override
    public void delete(Vet obj) {
        vetRepository.delete(obj);

    }

    @Override
    public void deleteById(Long id) {
        vetRepository.deleteById(id);

    }
}
