package front.recipient;

import java.io.Serializable;

public class TestRecipient implements Serializable {

    private String text;

    public String getText(){
        return this.text;
    }

    public void setText(String text){
        this.text = text;
    }
}
