package tn.esprit.autoloc.service;

import org.springframework.stereotype.Service;
import tn.esprit.autoloc.domain.Contrat;
import tn.esprit.autoloc.repository.ContratRepository;

import java.util.List;

@Service
public class ContratService {

    private final ContratRepository contratRepository;

    public ContratService(ContratRepository contratRepository) {
        this.contratRepository = contratRepository;
    }

    public Contrat addContrat(Contrat contrat) {
        return contratRepository.save(contrat);
    }

    public List<Contrat> getAllContrats() {
        return contratRepository.findAll();
    }

    public Contrat getContratById(Long id) {
        return contratRepository.findById(id).orElse(null);
    }

    public Contrat updateContrat(Contrat contrat) {
        return contratRepository.save(contrat);
    }

    public void deleteContrat(Long id) {
        contratRepository.deleteById(id);
    }
}
