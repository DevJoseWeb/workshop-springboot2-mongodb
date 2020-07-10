package br.comau.domain;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.util.UUID;

/**
 * @author Jose R F Junior
 * web2ajax@gmail.com
 * Santiago Chile 08/07/2020
 */
@Document(collection = "clientefisica")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ClienteJuridica implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    private String id;
    public  String fantasia;
    public  String cnpj;
    public  String tipo;
}
