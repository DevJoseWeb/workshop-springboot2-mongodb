package br.comau.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

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
    public  String fantasia;
    public  String cnpj;
    public  String tipo;

    public ClienteJuridica(String id, String fantasia, String cnpj, String tipo) {
        this.id = id;
        this.fantasia = fantasia;
        this.cnpj = cnpj;
        this.tipo = tipo;
    }

    public ClienteJuridica() {
    }

    public static ClienteJuridicaBuilder builder() {
        return new ClienteJuridicaBuilder();
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof ClienteJuridica)) return false;
        final ClienteJuridica other = (ClienteJuridica) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$id = this.getId();
        final Object other$id = other.getId();
        if (this$id == null ? other$id != null : !this$id.equals(other$id)) return false;
        final Object this$fantasia = this.getFantasia();
        final Object other$fantasia = other.getFantasia();
        if (this$fantasia == null ? other$fantasia != null : !this$fantasia.equals(other$fantasia)) return false;
        final Object this$cnpj = this.getCnpj();
        final Object other$cnpj = other.getCnpj();
        if (this$cnpj == null ? other$cnpj != null : !this$cnpj.equals(other$cnpj)) return false;
        final Object this$tipo = this.getTipo();
        final Object other$tipo = other.getTipo();
        if (this$tipo == null ? other$tipo != null : !this$tipo.equals(other$tipo)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof ClienteJuridica;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $id = this.getId();
        result = result * PRIME + ($id == null ? 43 : $id.hashCode());
        final Object $fantasia = this.getFantasia();
        result = result * PRIME + ($fantasia == null ? 43 : $fantasia.hashCode());
        final Object $cnpj = this.getCnpj();
        result = result * PRIME + ($cnpj == null ? 43 : $cnpj.hashCode());
        final Object $tipo = this.getTipo();
        result = result * PRIME + ($tipo == null ? 43 : $tipo.hashCode());
        return result;
    }

    public String toString() {
        return "ClienteJuridica(id=" + this.getId() + ", fantasia=" + this.getFantasia() + ", cnpj=" + this.getCnpj() + ", tipo=" + this.getTipo() + ")";
    }

    public String getId() {
        return this.id;
    }

    public String getFantasia() {
        return this.fantasia;
    }

    public String getCnpj() {
        return this.cnpj;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setFantasia(String fantasia) {
        this.fantasia = fantasia;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public static class ClienteJuridicaBuilder {
        private String id;
        private String fantasia;
        private String cnpj;
        private String tipo;

        ClienteJuridicaBuilder() {
        }

        public ClienteJuridica.ClienteJuridicaBuilder id(String id) {
            this.id = id;
            return this;
        }

        public ClienteJuridica.ClienteJuridicaBuilder fantasia(String fantasia) {
            this.fantasia = fantasia;
            return this;
        }

        public ClienteJuridica.ClienteJuridicaBuilder cnpj(String cnpj) {
            this.cnpj = cnpj;
            return this;
        }

        public ClienteJuridica.ClienteJuridicaBuilder tipo(String tipo) {
            this.tipo = tipo;
            return this;
        }

        public ClienteJuridica build() {
            return new ClienteJuridica(id, fantasia, cnpj, tipo);
        }

        public String toString() {
            return "ClienteJuridica.ClienteJuridicaBuilder(id=" + this.id + ", fantasia=" + this.fantasia + ", cnpj=" + this.cnpj + ", tipo=" + this.tipo + ")";
        }
    }
}
