package tn.esprit.rayendorbez4ssa15.Services.Impls;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.rayendorbez4ssa15.Domain.Contrat;
import tn.esprit.rayendorbez4ssa15.Repositories.IContratRepository;
import tn.esprit.rayendorbez4ssa15.Services.IContratService;

import java.util.List;

@Service
@AllArgsConstructor
public class ContratServiceImpl implements IContratService {

    private final IContratRepository contratRepository;

    @Override
    public Contrat createContrat(Contrat contrat) {
        return contratRepository.save(contrat);
    }

    @Override
    public Contrat getContratById(Long id) {
        return contratRepository.findById(id).orElse(null);
    }

    @Override
    public Contrat updateContrat(Contrat contrat) {
        return contratRepository.save(contrat);
    }

    @Override
    public void deleteContrat(Long id) {
        contratRepository.deleteById(id);
    }

    @Override
    public List<Contrat> getAllContrats() {
        return contratRepository.findAll();
    }
}
