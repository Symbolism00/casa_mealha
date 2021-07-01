package backoffice.model.value_objects;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class Preco implements Serializable {

    private String preco;

    protected Preco(){
        // for ORM
    }

    public Preco(String descricao) {
        setPreco(descricao);
    }

    public String getPreco() {
        return preco;
    }

    public void setPreco(String preco) {
        if(preco == null || preco.isEmpty()){
            throw new IllegalArgumentException("O preço não pode ser nulo ou vazio!");
        }
        this.preco = preco;
    }
}
