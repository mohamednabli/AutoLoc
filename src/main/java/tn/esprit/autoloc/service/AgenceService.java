package tn.esprit.autoloc.service;

import org.springframework.stereotype.Service;
import tn.esprit.autoloc.domain.Agence;
import tn.esprit.autoloc.repository.AgenceRepository;

import java.util.List;

@Service
public class AgenceService {

    private final AgenceRepository agenceRepository;

    public AgenceService(AgenceRepository agenceRepository) {
        this.agenceRepository = agenceRepository;
    }

    public Agence addAgence(Agence agence) {
        return agenceRepository.save(agence);
    }

    public List<Agence> getAllAgences() {
        return agenceRepository.findAll();
    }

    public Agence getAgenceById(Long id) {
        return agenceRepository.findById(id).orElse(null);
    }

    public Agence updateAgence(Agence agence) {
        return agenceRepository.save(agence);
    }

    public void deleteAgence(Long id) {
        agenceRepository.deleteById(id);
    }
}
