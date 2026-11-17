package tn.esprit.rayendorbez4ssa15.Web.Controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.rayendorbez4ssa15.Domain.Agence;
import tn.esprit.rayendorbez4ssa15.Services.IAgenceService;

import java.util.List;

@Tag(name = "gestionagence")
@RestController
@RequiredArgsConstructor
@RequestMapping("agence")
public class AgenceRestController {

    private final IAgenceService agenceService;

    @Operation(summary = "Récupérer la liste complète des agences")
    @GetMapping
    public List<Agence> findAll() {
        return agenceService.getAllAgences();
    }

    @Operation(summary = "Récupérer un(e) agence par identifiant")
    @GetMapping("/{id}")
    public Agence findById(@PathVariable Long id) {
        return agenceService.getAgenceById(id);
    }

    @Operation(summary = "Ajouter un(e) agence")
    @PostMapping
    public Agence create(@RequestBody Agence agence) {
        return agenceService.createAgence(agence);
    }

    @Operation(summary = "Modifier un(e) agence")
    @PutMapping
    public Agence update(@RequestBody Agence agence) {
        return agenceService.updateAgence(agence);
    }

    @Operation(summary = "Supprimer un(e) agence par identifiant")
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        agenceService.deleteAgence(id);
    }
}
