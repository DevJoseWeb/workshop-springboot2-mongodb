package br.comau.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.util.Objects;

/**
 * @author Jose R F Junior
 * web2ajax@gmail.com
 * Santiago Chile 08/07/2020
 */
@Document(collection = "clientefisica")
public class ClienteJuridica implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    private String id;
    public  String razaoSocial;
    public  String nomeFantasia;
    public  String cnpj;
    public  String tipo;
    public  String telefone;
    public  String email;
    public  String obs;
    public  String status;

    public ClienteJuridica() {
    }

    public ClienteJuridica(String id, String razaoSocial,
                           String nomeFantasia, String cnpj, String tipo,
                           String telefone, String email, String obs, String status
    ) {
        this.id = id;
        this.razaoSocial = razaoSocial;
        this.nomeFantasia = nomeFantasia;
        this.cnpj = cnpj;
        this.tipo = tipo;
        this.telefone = telefone;
        this.email = email;
        this.obs = obs;
        this.status = status;
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

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
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

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ClienteJuridica)) return false;
        ClienteJuridica that = (ClienteJuridica) o;
        return getId().equals(that.getId()) &&
                getRazaoSocial().equals(that.getRazaoSocial()) &&
                getNomeFantasia().equals(that.getNomeFantasia()) &&
                getCnpj().equals(that.getCnpj()) &&
                getTipo().equals(that.getTipo()) &&
                getTelefone().equals(that.getTelefone()) &&
                getEmail().equals(that.getEmail()) &&
                getObs().equals(that.getObs()) &&
                getStatus().equals(that.getStatus());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getRazaoSocial(), getNomeFantasia(), getCnpj(), getTipo(), getTelefone(), getEmail(), getObs(), getStatus());
    }
}
