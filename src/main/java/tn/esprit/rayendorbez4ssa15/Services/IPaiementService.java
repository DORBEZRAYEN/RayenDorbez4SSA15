package tn.esprit.rayendorbez4ssa15.Services;

import tn.esprit.rayendorbez4ssa15.Domain.Paiement;

import java.util.List;

public interface IPaiementService {
    Paiement createPaiement(Paiement paiement);

    Paiement getPaiementById(Long id);

    Paiement updatePaiement(Paiement paiement);

    void deletePaiement(Long id);

    List<Paiement> getAllPaiements();
}
