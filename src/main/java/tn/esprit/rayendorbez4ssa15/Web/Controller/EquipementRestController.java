package tn.esprit.rayendorbez4ssa15.Web.Controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.rayendorbez4ssa15.Domain.Equipement;
import tn.esprit.rayendorbez4ssa15.Services.IEquipementService;

import java.util.List;

@Tag(name = "gestionequipement")
@RestController
@RequiredArgsConstructor
@RequestMapping("equipement")
public class EquipementRestController {

    private final IEquipementService equipementService;

    @Operation(summary = "Récupérer la liste complète des equipements")
    @GetMapping
    public List<Equipement> findAll() {
        return equipementService.getAllEquipements();
    }

    @Operation(summary = "Récupérer un(e) equipement par identifiant")
    @GetMapping("/{id}")
    public Equipement findById(@PathVariable Long id) {
        return equipementService.getEquipementById(id);
    }

    @Operation(summary = "Ajouter un(e) equipement")
    @PostMapping
    public Equipement create(@RequestBody Equipement equipement) {
        return equipementService.createEquipement(equipement);
    }

    @Operation(summary = "Modifier un(e) equipement")
    @PutMapping
    public Equipement update(@RequestBody Equipement equipement) {
        return equipementService.updateEquipement(equipement);
    }

    @Operation(summary = "Supprimer un(e) equipement par identifiant")
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        equipementService.deleteEquipement(id);
    }
}
