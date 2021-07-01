package backoffice.model.value_objects;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class Descricao implements Serializable {

    private String descricao;

    protected Descricao(){
        // for ORM
    }

    public Descricao(String descricao) {
        setDescricao(descricao);
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        if(descricao == null || descricao.isEmpty()){
            throw new IllegalArgumentException("A descrição não pode ser nulo ou vazio!");
        }
        this.descricao = descricao;
    }
}
