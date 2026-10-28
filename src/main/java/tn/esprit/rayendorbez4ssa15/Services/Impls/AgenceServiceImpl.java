package tn.esprit.rayendorbez4ssa15.Services.Impls;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.rayendorbez4ssa15.Domain.Agence;
import tn.esprit.rayendorbez4ssa15.Repositories.IAgenceRepository;
import tn.esprit.rayendorbez4ssa15.Services.IAgenceService;

import java.util.List;

@Service
@AllArgsConstructor
public class AgenceServiceImpl implements IAgenceService {

    private final IAgenceRepository agenceRepository;

    @Override
    public Agence createAgence(Agence agence) {
        return agenceRepository.save(agence);
    }

    @Override
    public Agence getAgenceById(Long id) {
        return agenceRepository.findById(id).orElse(null);
    }

    @Override
    public Agence updateAgence(Agence agence) {
        return agenceRepository.save(agence);
    }

    @Override
    public void deleteAgence(Long id) {
        agenceRepository.deleteById(id);
    }

    @Override
    public List<Agence> getAllAgences() {
        return agenceRepository.findAll();
    }
}
