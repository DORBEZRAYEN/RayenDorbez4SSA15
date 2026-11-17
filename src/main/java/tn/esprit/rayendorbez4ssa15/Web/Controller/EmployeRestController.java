package tn.esprit.rayendorbez4ssa15.Web.Controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.rayendorbez4ssa15.Domain.Employe;
import tn.esprit.rayendorbez4ssa15.Services.IEmployeService;

import java.util.List;

@Tag(name = "gestionemploye")
@RestController
@RequiredArgsConstructor
@RequestMapping("employe")
public class EmployeRestController {

    private final IEmployeService employeService;

    @Operation(summary = "Récupérer la liste complète des employes")
    @GetMapping
    public List<Employe> findAll() {
        return employeService.getAllEmployes();
    }

    @Operation(summary = "Récupérer un(e) employe par identifiant")
    @GetMapping("/{id}")
    public Employe findById(@PathVariable Long id) {
        return employeService.getEmployeById(id);
    }

    @Operation(summary = "Ajouter un(e) employe")
    @PostMapping
    public Employe create(@RequestBody Employe employe) {
        return employeService.createEmploye(employe);
    }

    @Operation(summary = "Modifier un(e) employe")
    @PutMapping
    public Employe update(@RequestBody Employe employe) {
        return employeService.updateEmploye(employe);
    }

    @Operation(summary = "Supprimer un(e) employe par identifiant")
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        employeService.deleteEmploye(id);
    }
}
