package backoffice.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Test {

    @Id
    private String text;

    protected Test(){
        // for ORM
    }

    public Test(String text){
        this.text = text;
    }

    public void incrementSubstringT(){
        this.text = this.text + "t";
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
