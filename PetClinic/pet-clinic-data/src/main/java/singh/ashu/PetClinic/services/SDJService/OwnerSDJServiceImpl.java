package singh.ashu.PetClinic.services.SDJService;

import org.springframework.stereotype.Service;
import singh.ashu.PetClinic.models.Owner;
import singh.ashu.PetClinic.repository.OwnerRepository;

import java.util.List;

@Service
public class OwnerSDJServiceImpl implements OwnerSDJService {
    private final OwnerRepository ownerRepository;

    public OwnerSDJServiceImpl(OwnerRepository ownerRepository) {
        this.ownerRepository = ownerRepository;
    }

    @Override
    public Owner save(Owner obj) {
        return ownerRepository.save(obj);
    }

    @Override
    public Owner findById(Long id) {
        return ownerRepository.findById(id).orElse(null);
    }

    @Override
    public List<Owner> findAll() {
        return ownerRepository.findAll();
    }

    @Override
    public void delete(Owner obj) {
          ownerRepository.delete(obj);
    }

    @Override
    public void deleteById(Long id) {
          ownerRepository.deleteById(id);
    }
}
