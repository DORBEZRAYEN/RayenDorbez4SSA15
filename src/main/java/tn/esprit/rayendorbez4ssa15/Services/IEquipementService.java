package tn.esprit.rayendorbez4ssa15.Services;

import tn.esprit.rayendorbez4ssa15.Domain.Equipement;

import java.util.List;

public interface IEquipementService {
    Equipement createEquipement(Equipement equipement);

    Equipement getEquipementById(Long id);

    Equipement updateEquipement(Equipement equipement);

    void deleteEquipement(Long id);

    List<Equipement> getAllEquipements();
}
