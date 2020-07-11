package br.comau.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * @author Jose R F Junior
 * web2ajax@gmail.com
 * Santiago Chile 08/07/2020
 */
@Document(collection = "clientefisica")
public class ClienteFisica implements Serializable {
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
    //public  String perfil; quando for fazer o login vai ter que relacionar

    // @JsonFormat(pattern="dd/MM/yyyy HH:mm")
    //public  Date vistoDataVencimento; //Locale brasil = new Locale("pt", "BR");
    public  String vistoDataVencimento;

    public ClienteFisica() {
    }

    /*public ClienteFisica() {
        addPerfil(Perfil.CLIENTE);
    }*/

    public ClienteFisica(String id, String nome, String cpf,
                         String tipo, String endereco, String telefone,
                         String email, String status, String empresa,
                         String vistoDataVencimento
    ) {
        super();
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.tipo = tipo;
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
        this.status = status;
        this.empresa = empresa;
        this.vistoDataVencimento = vistoDataVencimento;
        //addPerfil(Perfil.CLIENTE);

    }

    /*public Set<Perfil> getPerfis() {
        return perfis.stream().map(x -> Perfil.toEnum(x)).collect(Collectors.toSet());
    }

    public void addPerfil(Perfil perfil) {
        perfis.add(perfil.getCod());
    }*/

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

    /*public Date getVistoDataVencimento() {
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

    @Override
    public String toString() {

        NumberFormat nf = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        StringBuilder builder = new StringBuilder();

        builder.append("Código: ");
        builder.append(getId());

        //builder.append(", Data: ");
        //builder.append(sdf.format(getVistoDataVencimento()));

        builder.append(", Cliente: ");
        builder.append(getNome());

        return builder.toString();
}
}