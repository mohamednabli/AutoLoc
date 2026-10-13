package tn.esprit.autoloc.service;

import org.springframework.stereotype.Service;
import tn.esprit.autoloc.domain.Equipement;
import tn.esprit.autoloc.repository.EquipementRepository;

import java.util.List;

@Service
public class EquipementService {

    private final EquipementRepository equipementRepository;

    public EquipementService(EquipementRepository equipementRepository) {
        this.equipementRepository = equipementRepository;
    }

    public Equipement addEquipement(Equipement equipement) {
        return equipementRepository.save(equipement);
    }

    public List<Equipement> getAllEquipements() {
        return equipementRepository.findAll();
    }

    public Equipement getEquipementById(Long id) {
        return equipementRepository.findById(id).orElse(null);
    }

    public Equipement updateEquipement(Equipement equipement) {
        return equipementRepository.save(equipement);
    }

    public void deleteEquipement(Long id) {
        equipementRepository.deleteById(id);
    }
}
