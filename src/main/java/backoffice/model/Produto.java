package backoffice.model;

import backoffice.model.value_objects.Descricao;
import backoffice.model.value_objects.EntityId;
import backoffice.model.value_objects.Nome;
import backoffice.model.value_objects.Preco;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table
public class Produto implements Serializable, DomainEntity {

    @EmbeddedId
    private Nome nome;

    private Descricao descricao;

    private Preco preco;

    protected Produto(){
        // for ORM
    }

    public Produto(String nome, String descricao, String preco){
        this.nome = new Nome(nome);
        this.descricao = new Descricao(descricao);
        this.preco = new Preco(preco);
    }

    @Override
    public EntityId getEntityId() {
        return nome;
    }

    public void setNome(Nome nome) {
        this.nome = nome;
    }

    public Descricao getDescricao() {
        return descricao;
    }

    public void setDescricao(Descricao descricao) {
        this.descricao = descricao;
    }

    public Preco getPreco() {
        return preco;
    }

    public void setPreco(Preco preco) {
        this.preco = preco;
    }

}
