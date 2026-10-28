package tn.esprit.rayendorbez4ssa15.Services.Impls;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.rayendorbez4ssa15.Domain.Client;
import tn.esprit.rayendorbez4ssa15.Repositories.IClientRepository;
import tn.esprit.rayendorbez4ssa15.Services.IClientService;

import java.util.List;

@Service
@AllArgsConstructor
public class ClientServiceImpl implements IClientService {

    private final IClientRepository clientRepository;

    @Override
    public Client createClient(Client client) {
        return clientRepository.save(client);
    }

    @Override
    public Client getClientById(Long id) {
        return clientRepository.findById(id).orElse(null);
    }

    @Override
    public Client updateClient(Client client) {
        return clientRepository.save(client);
    }

    @Override
    public void deleteClient(Long id) {
        clientRepository.deleteById(id);
    }

    @Override
    public List<Client> getAllClients() {
        return clientRepository.findAll();
    }
}
