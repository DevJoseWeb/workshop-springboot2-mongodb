package br.comau.services;

import br.comau.domain.ClienteFisica;
import br.comau.dto.ClienteFisicaDTO;
import br.comau.repository.ClienteFisicaRepository;
import br.comau.services.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * @author Jose R F Junior
 * web2ajax@gmail.com
 * Santiago Chile 08/07/2020
 */
@Service
public class ClienteFisicaService {

    @Autowired
    private ClienteFisicaRepository clienteFisicaRepository;

    public List<ClienteFisica> findAll() {
        return clienteFisicaRepository.findAll();
    }

    public ClienteFisica findById(String id) {
        Optional<ClienteFisica> obj = clienteFisicaRepository.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
    }

    public ClienteFisica insert(ClienteFisica obj) {
        return clienteFisicaRepository.insert(obj);
    }

    public void delete(String id) {
        findById(id);
        clienteFisicaRepository.deleteById(id);
    }

    public ClienteFisica update(ClienteFisica obj) {
        ClienteFisica newObj = findById(obj.getId());
        updateData(newObj, obj);
        return clienteFisicaRepository.save(newObj);
    }

    private void updateData(ClienteFisica newObj, ClienteFisica obj) {
        newObj.setNome(obj.getNome());
        newObj.setCpf(obj.getCpf());
        newObj.setTipo(obj.getTipo());
        newObj.setTipo(obj.getEndereco());
        newObj.setTipo(obj.getTelefone());
        newObj.setTipo(obj.getEmail());
        newObj.setTipo(obj.getStatus());
        newObj.setTipo(obj.getEmpresa());
        newObj.setTipo(obj.getVistoDataVencimento());
    }

    public ClienteFisica fromDTO(ClienteFisicaDTO objDto) {
        return new ClienteFisica(
                objDto.getId(),
                objDto.getNome(),
                objDto.getCpf(),
                objDto.getTipo(),
                objDto.getEndereco(),
                objDto.getTelefone(),
                objDto.getEmail(),
                objDto.getStatus(),
                objDto.getEmpresa(),
                objDto.getVistoDataVencimento()
        );
    }
}
