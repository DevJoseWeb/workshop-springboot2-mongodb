package br.comau.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

/**
 * @author Jose R F Junior
 * web2ajax@gmail.com
 * Santiago Chile 08/07/2020
 */
@Document(collection = "usuario")
public class Usuario implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    private String id;
    private String login;
    private String senha;
    private String perfil;
    private String pessoaFisica;
    private String PessoaJuridica;

    public Usuario() {
    }

    public Usuario(String id, String login, String senha, String perfil, String pessoaFisica, String pessoaJuridica) {
        this.id = id;
        this.login = login;
        this.senha = senha;
        this.perfil = perfil;
        this.pessoaFisica = pessoaFisica;
        PessoaJuridica = pessoaJuridica;
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

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getPerfil() {
        return perfil;
    }

    public void setPerfil(String perfil) {
        this.perfil = perfil;
    }

    public String getPessoaFisica() {
        return pessoaFisica;
    }

    public void setPessoaFisica(String pessoaFisica) {
        this.pessoaFisica = pessoaFisica;
    }

    public String getPessoaJuridica() {
        return PessoaJuridica;
    }

    public void setPessoaJuridica(String pessoaJuridica) {
        PessoaJuridica = pessoaJuridica;
    }


}