package tn.esprit.rayendorbez4ssa15.Web.Controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.rayendorbez4ssa15.Domain.Contrat;
import tn.esprit.rayendorbez4ssa15.Services.IContratService;

import java.util.List;

@Tag(name = "gestioncontrat")
@RestController
@RequiredArgsConstructor
@RequestMapping("contrat")
public class ContratRestController {

    private final IContratService contratService;

    @Operation(summary = "Récupérer la liste complète des contrats")
    @GetMapping
    public List<Contrat> findAll() {
        return contratService.getAllContrats();
    }

    @Operation(summary = "Récupérer un(e) contrat par identifiant")
    @GetMapping("/{id}")
    public Contrat findById(@PathVariable Long id) {
        return contratService.getContratById(id);
    }

    @Operation(summary = "Ajouter un(e) contrat")
    @PostMapping
    public Contrat create(@RequestBody Contrat contrat) {
        return contratService.createContrat(contrat);
    }

    @Operation(summary = "Modifier un(e) contrat")
    @PutMapping
    public Contrat update(@RequestBody Contrat contrat) {
        return contratService.updateContrat(contrat);
    }

    @Operation(summary = "Supprimer un(e) contrat par identifiant")
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        contratService.deleteContrat(id);
    }
}
