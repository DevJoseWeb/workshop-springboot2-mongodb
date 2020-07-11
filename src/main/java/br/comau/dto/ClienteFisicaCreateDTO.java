package br.comau.dto;

import br.comau.domain.ClienteFisica;

import java.io.Serializable;

/**
 * @author Jose R F Junior
 * web2ajax@gmail.com
 * Santiago Chile 08/07/2020
 */
public class ClienteFisicaCreateDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    public  String id;
    public  String nome;
    public  String cpf;
    public  String tipo;

    public ClienteFisicaCreateDTO() {
    }

    public ClienteFisicaCreateDTO(ClienteFisica obj){
        id = obj.getId();
        nome = obj.getNome();
        cpf = obj.getCpf();
        tipo = obj.getTipo();
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
