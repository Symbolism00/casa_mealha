package backoffice.repository.abstracts;

import backoffice.model.Produto;

public interface IProdutoRepository {

    boolean saveProdutoRecipient(Produto produto);
}
