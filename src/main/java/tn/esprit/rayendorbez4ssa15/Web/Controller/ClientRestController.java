package tn.esprit.rayendorbez4ssa15.Web.Controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.rayendorbez4ssa15.Domain.Client;
import tn.esprit.rayendorbez4ssa15.Services.IClientService;

import java.util.List;

@Tag(name = "gestionclient")
@RestController
@RequiredArgsConstructor
@RequestMapping("client")
public class ClientRestController {

    private final IClientService clientService;

    @Operation(summary = "Récupérer la liste complète des clients")
    @GetMapping
    public List<Client> findAll() {
        return clientService.getAllClients();
    }

    @Operation(summary = "Récupérer un(e) client par identifiant")
    @GetMapping("/{id}")
    public Client findById(@PathVariable Long id) {
        return clientService.getClientById(id);
    }

    @Operation(summary = "Ajouter un(e) client")
    @PostMapping
    public Client create(@RequestBody Client client) {
        return clientService.createClient(client);
    }

    @Operation(summary = "Modifier un(e) client")
    @PutMapping
    public Client update(@RequestBody Client client) {
        return clientService.updateClient(client);
    }

    @Operation(summary = "Supprimer un(e) client par identifiant")
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        clientService.deleteClient(id);
    }
}
