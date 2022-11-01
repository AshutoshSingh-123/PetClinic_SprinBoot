package singh.ashu.PetClinic.services.SDJService;

import org.springframework.stereotype.Service;
import singh.ashu.PetClinic.models.Visit;
import singh.ashu.PetClinic.repository.VisitRepository;

import java.util.List;

@Service
public class VisitSDJServiceImpl implements VisitSDJService {

    private final VisitRepository visitRepository;

    public VisitSDJServiceImpl(VisitRepository visitRepository) {
        this.visitRepository = visitRepository;
    }

    @Override
    public Visit save(Visit obj) {
        return visitRepository.save(obj);
    }

    @Override
    public Visit findById(Long id) {
        return visitRepository.findById(id).orElse(null);
    }

    @Override
    public List<Visit> findAll() {
        return visitRepository.findAll();
    }

    @Override
    public void delete(Visit obj) {
        visitRepository.delete(obj);

    }

    @Override
    public void deleteById(Long id) {
        visitRepository.deleteById(id);

    }
}
