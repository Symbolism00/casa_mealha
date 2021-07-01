package backoffice.model.value_objects;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class Nome implements EntityId, Serializable {

    private String nome;

    protected Nome(){
        // for ORM
    }

    public Nome(String nome) {
        setNome(nome);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if(nome == null || nome.isEmpty()){
            throw new IllegalArgumentException("O nome não pode ser nulo ou vazio!");
        }
        this.nome = nome;
    }
}
