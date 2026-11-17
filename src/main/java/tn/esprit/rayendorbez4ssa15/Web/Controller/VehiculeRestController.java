package tn.esprit.rayendorbez4ssa15.Web.Controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.rayendorbez4ssa15.Domain.Vehicule;
import tn.esprit.rayendorbez4ssa15.Services.IVehiculeService;

import java.util.List;

@Tag(name = "gestionvehicule")
@RestController
@RequiredArgsConstructor
@RequestMapping("vehicule")
public class VehiculeRestController {

    private final IVehiculeService vehiculeService;

    @Operation(summary = "Récupérer la liste complète des vehicules")
    @GetMapping
    public List<Vehicule> findAll() {
        return vehiculeService.getAllVehicules();
    }

    @Operation(summary = "Récupérer un(e) vehicule par identifiant")
    @GetMapping("/{id}")
    public Vehicule findById(@PathVariable Long id) {
        return vehiculeService.getVehiculeById(id);
    }

    @Operation(summary = "Ajouter un(e) vehicule")
    @PostMapping
    public Vehicule create(@RequestBody Vehicule vehicule) {
        return vehiculeService.createVehicule(vehicule);
    }

    @Operation(summary = "Modifier un(e) vehicule")
    @PutMapping
    public Vehicule update(@RequestBody Vehicule vehicule) {
        return vehiculeService.updateVehicule(vehicule);
    }

    @Operation(summary = "Supprimer un(e) vehicule par identifiant")
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        vehiculeService.deleteVehicule(id);
    }
}
