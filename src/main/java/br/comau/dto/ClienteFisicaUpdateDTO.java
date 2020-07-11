package br.comau.dto;

import br.comau.domain.ClienteFisica;
import org.springframework.data.annotation.Id;

import java.io.Serializable;
import java.util.Date;

/**
 * @author Jose R F Junior
 * web2ajax@gmail.com
 * Santiago Chile 08/07/2020
 */
public
class ClienteFisicaUpdateDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    private String id;
    public  String nome;
    public  String cpf;
    public  String tipo;
    public  String endereco;
    public  String telefone;
    public  String email;
    public  String status;
    public  String empresa;
    //public Date vistoDataVencimento;
    public String vistoDataVencimento;

    public ClienteFisicaUpdateDTO(){
    }
    public ClienteFisicaUpdateDTO(ClienteFisica ObjclienteFisica){

        id = ObjclienteFisica.getId();
        nome = ObjclienteFisica.getNome();
        cpf = ObjclienteFisica.getCpf();
        tipo = ObjclienteFisica.getTipo();
        endereco = ObjclienteFisica.getEndereco();
        telefone = ObjclienteFisica.getTelefone();
        email = ObjclienteFisica.getEmail();
        status = ObjclienteFisica.getStatus();
        empresa = ObjclienteFisica.getEmpresa();
        vistoDataVencimento = ObjclienteFisica.getVistoDataVencimento();

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

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

   /* public Date getVistoDataVencimento() {
        return vistoDataVencimento;
    }

    public void setVistoDataVencimento(Date vistoDataVencimento) {
        this.vistoDataVencimento = vistoDataVencimento;
    }*/

    public String getVistoDataVencimento() {
        return vistoDataVencimento;
    }

    public void setVistoDataVencimento(String vistoDataVencimento) {
        this.vistoDataVencimento = vistoDataVencimento;
    }
}
