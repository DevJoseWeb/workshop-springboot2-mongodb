package br.comau.resources;


import java.net.URI;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import br.comau.domain.ClienteFisica;
import br.comau.dto.ClienteFisicaDTO;
import br.comau.services.ClienteFisicaService;

//@CrossOrigin(origins = "*")
@RestController
@RequestMapping(value = "/api")
public class ClienteFisicaController {

    @Autowired
    private ClienteFisicaService clienteFisicaService;

    @RequestMapping(method=RequestMethod.GET)
    public ResponseEntity<List<ClienteFisicaDTO>> findAll() {
        List<ClienteFisica> list = clienteFisicaService.findAll();
        List<ClienteFisicaDTO> listDto = list.parallelStream()
                .map(ClienteFisicaDTO::new)
                .collect(Collectors.toList());
        return ResponseEntity.ok().body(listDto);
    }

    @RequestMapping(value="/{id}", method=RequestMethod.GET)
    public ResponseEntity<ClienteFisicaDTO> findById(@PathVariable String id) {
        ClienteFisica obj = clienteFisicaService.findById(id);
        return ResponseEntity.ok().body(new ClienteFisicaDTO(obj));
    }

    @RequestMapping(method=RequestMethod.POST)
    public ResponseEntity<Void> insert(@RequestBody ClienteFisicaDTO objDto) {
        ClienteFisica obj = clienteFisicaService.fromDTO(objDto);
        obj = clienteFisicaService.insert(obj);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(obj.getId()).toUri();
        return ResponseEntity.created(uri).build();
    }

    @RequestMapping(value="/{id}", method=RequestMethod.DELETE)
    public ResponseEntity<Void> delete(@PathVariable String id) {
        clienteFisicaService.delete(id);
        return ResponseEntity.noContent().build();
    }

}
