package tn.esprit.rayendorbez4ssa15.Web.Controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.rayendorbez4ssa15.Domain.Paiement;
import tn.esprit.rayendorbez4ssa15.Services.IPaiementService;

import java.util.List;

@Tag(name = "gestionpaiement")
@RestController
@RequiredArgsConstructor
@RequestMapping("paiement")
public class PaiementRestController {

    private final IPaiementService paiementService;

    @Operation(summary = "Récupérer la liste complète des paiements")
    @GetMapping
    public List<Paiement> findAll() {
        return paiementService.getAllPaiements();
    }

    @Operation(summary = "Récupérer un(e) paiement par identifiant")
    @GetMapping("/{id}")
    public Paiement findById(@PathVariable Long id) {
        return paiementService.getPaiementById(id);
    }

    @Operation(summary = "Ajouter un(e) paiement")
    @PostMapping
    public Paiement create(@RequestBody Paiement paiement) {
        return paiementService.createPaiement(paiement);
    }

    @Operation(summary = "Modifier un(e) paiement")
    @PutMapping
    public Paiement update(@RequestBody Paiement paiement) {
        return paiementService.updatePaiement(paiement);
    }

    @Operation(summary = "Supprimer un(e) paiement par identifiant")
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        paiementService.deletePaiement(id);
    }
}
