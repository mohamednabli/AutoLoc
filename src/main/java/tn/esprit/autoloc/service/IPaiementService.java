package tn.esprit.autoloc.service;

import tn.esprit.autoloc.domain.Paiement;

import java.util.List;

public interface IPaiementService {
    Paiement addPaiement(Paiement paiement);
    List<Paiement> getAllPaiements();
    Paiement getPaiementById(Long id);
    Paiement updatePaiement(Paiement paiement);
    void deletePaiement(Long id);
}
