package backoffice.service.abstracts;

import backoffice.dto.ProdutoDTO;

public interface IProdutoService {

    boolean saveProdutoRecipient(ProdutoDTO produtoDTO);
}
