package br.comau.dto;

import br.comau.domain.ClienteFisica;

import java.io.Serializable;

/**
 * @author Jose R F Junior
 * web2ajax@gmail.com
 * Santiago Chile 08/07/2020
 */
public
class ClienteFisicaUpdateDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    public  String id;
    public  String nome;
    public  String cpf;
    public  String tipo;

    ClienteFisicaUpdateDTO(ClienteFisica ObjclienteFisica){
        id = ObjclienteFisica.getId();
        nome = ObjclienteFisica.getNome();
        cpf = ObjclienteFisica.getCpf();
        tipo = ObjclienteFisica.getTipo();
    }

    public ClienteFisicaUpdateDTO(String id, String nome, String cpf, String tipo) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.tipo = tipo;
    }

    public ClienteFisicaUpdateDTO() {
    }

    public String getId() {
        return this.id;
    }

    public String getNome() {
        return this.nome;
    }

    public String getCpf() {
        return this.cpf;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof ClienteFisicaUpdateDTO)) return false;
        final ClienteFisicaUpdateDTO other = (ClienteFisicaUpdateDTO) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$id = this.getId();
        final Object other$id = other.getId();
        if (this$id == null ? other$id != null : !this$id.equals(other$id)) return false;
        final Object this$nome = this.getNome();
        final Object other$nome = other.getNome();
        if (this$nome == null ? other$nome != null : !this$nome.equals(other$nome)) return false;
        final Object this$cpf = this.getCpf();
        final Object other$cpf = other.getCpf();
        if (this$cpf == null ? other$cpf != null : !this$cpf.equals(other$cpf)) return false;
        final Object this$tipo = this.getTipo();
        final Object other$tipo = other.getTipo();
        if (this$tipo == null ? other$tipo != null : !this$tipo.equals(other$tipo)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof ClienteFisicaUpdateDTO;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $id = this.getId();
        result = result * PRIME + ($id == null ? 43 : $id.hashCode());
        final Object $nome = this.getNome();
        result = result * PRIME + ($nome == null ? 43 : $nome.hashCode());
        final Object $cpf = this.getCpf();
        result = result * PRIME + ($cpf == null ? 43 : $cpf.hashCode());
        final Object $tipo = this.getTipo();
        result = result * PRIME + ($tipo == null ? 43 : $tipo.hashCode());
        return result;
    }

    public String toString() {
        return "ClienteFisicaUpdateDTO(nome=" + this.getNome() + ", cpf=" + this.getCpf() + ", tipo=" + this.getTipo() + ")";
    }
}
