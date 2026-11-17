package tn.esprit.rayendorbez4ssa15.Web.Controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.rayendorbez4ssa15.Domain.Maintenance;
import tn.esprit.rayendorbez4ssa15.Services.IMaintenanceService;

import java.util.List;

@Tag(name = "gestionmaintenance")
@RestController
@RequiredArgsConstructor
@RequestMapping("maintenance")
public class MaintenanceRestController {

    private final IMaintenanceService maintenanceService;

    @Operation(summary = "Récupérer la liste complète des maintenances")
    @GetMapping
    public List<Maintenance> findAll() {
        return maintenanceService.getAllMaintenances();
    }

    @Operation(summary = "Récupérer un(e) maintenance par identifiant")
    @GetMapping("/{id}")
    public Maintenance findById(@PathVariable Long id) {
        return maintenanceService.getMaintenanceById(id);
    }

    @Operation(summary = "Ajouter un(e) maintenance")
    @PostMapping
    public Maintenance create(@RequestBody Maintenance maintenance) {
        return maintenanceService.createMaintenance(maintenance);
    }

    @Operation(summary = "Modifier un(e) maintenance")
    @PutMapping
    public Maintenance update(@RequestBody Maintenance maintenance) {
        return maintenanceService.updateMaintenance(maintenance);
    }

    @Operation(summary = "Supprimer un(e) maintenance par identifiant")
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        maintenanceService.deleteMaintenance(id);
    }
}
