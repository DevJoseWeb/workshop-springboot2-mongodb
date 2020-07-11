package br.comau.resources;

import br.comau.domain.ClienteFisica;
import br.comau.dto.ClienteFisicaDTO;
import br.comau.services.ClienteFisicaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;
import java.util.stream.Collectors;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping(value = "/api/v1")
public class ClienteFisicaController {

    @Autowired
    private ClienteFisicaService clienteFisicaService;

    @RequestMapping(value = "/lista/todos", method= RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<List<ClienteFisicaDTO>> findAll() {
        List<ClienteFisica> list = clienteFisicaService.findAll();
        List<ClienteFisicaDTO> listDto = list.parallelStream()
                .map(ClienteFisicaDTO::new)
                .collect(Collectors.toList());
        return ResponseEntity.ok().body(listDto);
    }

    @RequestMapping(value="/lista/{id}", params = "id", method=RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<ClienteFisicaDTO> findById(@PathVariable String id) {
        ClienteFisica obj = clienteFisicaService.findById(id);
        return ResponseEntity.ok().body(new ClienteFisicaDTO(obj));
    }

    @RequestMapping(value="/inserir/{id}", params = "id", method=RequestMethod.POST)
    @ResponseBody
    public ResponseEntity<Void> insert(@RequestBody ClienteFisicaDTO objDto) {
        ClienteFisica obj = clienteFisicaService.fromDTO(objDto);
        obj = clienteFisicaService.insert(obj);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(obj.getId()).toUri();
        return ResponseEntity.created(uri).build();
    }

    @RequestMapping(value="/inserir/{id}", params = "id", method=RequestMethod.DELETE)
    @ResponseBody
    public ResponseEntity<Void> delete(@PathVariable String id) {
        clienteFisicaService.delete(id);
        return ResponseEntity.noContent().build();
    }

}
