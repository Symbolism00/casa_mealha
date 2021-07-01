package backoffice.controller.concretes;

import backoffice.controller.abstracts.IProdutoController;
import backoffice.dto.ProdutoDTO;
import backoffice.mapper.ProdutoMapper;
import backoffice.service.abstracts.IProdutoService;
import front.recipient.ProdutoRecipient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller("produtoController")
public class ProdutoController implements IProdutoController {

    private IProdutoService produtoService;

    public boolean saveTestRecipient(ProdutoRecipient produtoRecipient){
        ProdutoDTO produtoDTO = ProdutoMapper.recipientToDTO(produtoRecipient);
        // do something with that
        return produtoService.saveProdutoRecipient(produtoDTO);
    }

    @Autowired
    public void setTestService(IProdutoService produtoService) {
        this.produtoService = produtoService;
    }
}
