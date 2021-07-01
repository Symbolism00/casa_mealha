package front.bean_container;

import backoffice.controller.abstracts.IProdutoController;
import front.recipient.ProdutoRecipient;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import java.io.Serializable;
import java.util.logging.Logger;

@ManagedBean
@SessionScoped
public class ProdutoBean implements Serializable {

    private ProdutoRecipient produtoRecipient;
    private static final Logger LOGGER = Logger.getLogger(ProdutoBean.class.getName());

    @ManagedProperty("#{produtoController}")
    private IProdutoController produtoController;

    @PostConstruct
    public void init(){
        produtoRecipient = new ProdutoRecipient();
    }

    public String saveProdutoRecipient(){
        return produtoController.saveTestRecipient(produtoRecipient) ? "adicionado" : "nao_adicionado";
    }

    // getters and setters
    public ProdutoRecipient getProdutoRecipient(){
        return this.produtoRecipient;
    }

    public void setProdutoRecipient(ProdutoRecipient produtoRecipient){
        this.produtoRecipient = produtoRecipient;
    }

    public IProdutoController getProdutoController() {
        return produtoController;
    }

    public void setProdutoController(IProdutoController produtoController) {
        this.produtoController = produtoController;
    }
}
