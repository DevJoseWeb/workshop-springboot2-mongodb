package br.comau.services;

import br.comau.domain.ClienteFisica;
import br.comau.domain.User;
import br.comau.dto.ClienteFisicaCreateDTO;
import br.comau.dto.ClienteFisicaDTO;
import br.comau.dto.ClienteFisicaUpdateDTO;
import br.comau.dto.UserDTO;
import br.comau.repository.ClienteFisicaRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author Jose R F Junior
 * web2ajax@gmail.com
 * Santiago Chile 08/07/2020
 */
public class ClienteFisicaService {

    @Autowired
    private ClienteFisicaRepository clienteFisicaRepository;

    public List<ClienteFisica> findAll() {
        return clienteFisicaRepository.findAll();
    }

    public ClienteFisica insert(ClienteFisica obj) {
        return clienteFisicaRepository.insert(obj);
    }

    public ClienteFisica fromDTO(ClienteFisicaDTO objDto) {
        return new ClienteFisica(objDto.getId(), objDto.getNome(), objDto.getCpf(), objDto.getTipo());
    }

}
