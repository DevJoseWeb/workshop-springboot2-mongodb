package br.comau.dto;

import br.comau.domain.ClienteFisica;
import lombok.*;

import java.io.Serializable;

/**
 * @author Jose R F Junior
 * web2ajax@gmail.com
 * Santiago Chile 08/07/2020
 */
@NoArgsConstructor
@AllArgsConstructor
@ToString(exclude="id")
@EqualsAndHashCode
@Data
@Getter
@Setter
public class ClienteFisicaDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    public  String id;
    public  String nome;
    public  String cpf;
    public  String tipo;

    public ClienteFisicaDTO(ClienteFisica ObjclienteFisica){
        id = ObjclienteFisica.getId();
        nome = ObjclienteFisica.getNome();
        cpf = ObjclienteFisica.getCpf();
        tipo = ObjclienteFisica.getTipo();
    }
}
