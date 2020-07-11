package br.comau.services;

import br.comau.domain.ClienteFisica;
import br.comau.dto.ClienteFisicaDTO;
import br.comau.repository.ClienteFisicaRepository;
import br.comau.services.exception.ObjectNotFoundException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;


/**
 * @author Jose R F Junior
 * web2ajax@gmail.com
 * Santiago Chile 08/07/2020
 */
@Service
public class ClienteFisicaService {

    private static final Logger LOG = LoggerFactory.getLogger(ClienteFisicaService.class);

    @Autowired
    private ClienteFisicaRepository clienteFisicaRepository;

    @Autowired
    private ClienteFisicaService clienteFisicaService;

    public List<ClienteFisica> findAll() {
        return clienteFisicaRepository.findAll();
    }

    public ClienteFisica findById(String id) {
        Optional<ClienteFisica> obj = clienteFisicaRepository.findById(id);
        LOG.info("Objeto não encontrado");
        return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
    }

    public ClienteFisica insert(ClienteFisica obj) {
        return clienteFisicaRepository.insert(obj);
    }

    public void delete(String id) {
        findById(id);
        LOG.info("Deletado Cliente Fisica");
        clienteFisicaRepository.deleteById(id);
    }

   /* public Page<ClienteFisica> findPage(Integer page, Integer linesPerPage, String orderBy, String direction) {
           PageRequest pageRequest = PageRequest.of(page, linesPerPage, Direction.valueOf(direction), orderBy);
           return clienteFisicaRepository.findByClienteFisica(pageRequest);
    }*/

    public ClienteFisica update(ClienteFisica obj) {
        ClienteFisica newObj = findById(obj.getId());
        updateData(newObj, obj);
        return clienteFisicaRepository.save(newObj);
    }

    private void updateData(ClienteFisica newObj, ClienteFisica obj) {
        newObj.setNome(obj.getNome());
        newObj.setCpf(obj.getCpf());
        newObj.setTipo(obj.getTipo());
        newObj.setEndereco(obj.getEndereco());
        newObj.setTelefone(obj.getTelefone());
        newObj.setEmail(obj.getEmail());
        newObj.setStatus(obj.getStatus());
        newObj.setEmpresa(obj.getEmpresa());
        newObj.setVistoDataVencimento(obj.getVistoDataVencimento());
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
