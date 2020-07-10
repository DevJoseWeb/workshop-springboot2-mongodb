package br.comau.resources;

import br.comau.domain.User;
import br.comau.dto.ClienteFisicaDTO;
import br.comau.dto.UserDTO;
import br.comau.services.ClienteFisicaService;
import br.comau.domain.ClienteFisica;
import br.comau.dto.ClienteFisicaCreateDTO;
import br.comau.dto.ClienteFisicaUpdateDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;


@CrossOrigin(origins = "*")
@RestController
@RequestMapping(value = "/api/v1")
public class ClienteFisicaController {

    private ClienteFisicaService clienteFisicaService;

    @RequestMapping(method=RequestMethod.GET)
    public ResponseEntity<List<ClienteFisicaDTO>> findAll() {
        List<ClienteFisica> list = clienteFisicaService.findAll();
        List<ClienteFisicaDTO> listDto = list.stream().map(x -> new ClienteFisicaDTO(x)).collect(Collectors.toList());
        return ResponseEntity.ok().body(listDto);
    }

}
