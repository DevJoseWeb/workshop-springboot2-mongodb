package br.comau.dto;

import br.comau.domain.ClienteFisica;

import java.io.Serializable;

public class ClienteJuridicaUpdateDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    public String id;
    public String nome;
    public String cpf;
    public String tipo;

    ClienteJuridicaUpdateDTO(ClienteFisica ObjclienteJuridica) {
        id = ObjclienteJuridica.getId();
        nome = ObjclienteJuridica.getNome();
        cpf = ObjclienteJuridica.getCpf();
        tipo = ObjclienteJuridica.getTipo();
    }
}