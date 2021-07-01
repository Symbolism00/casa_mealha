package backoffice.mapper;

import backoffice.dto.ProdutoDTO;
import backoffice.model.Produto;
import front.recipient.ProdutoRecipient;

public class ProdutoMapper {

    public static ProdutoDTO recipientToDTO(ProdutoRecipient produtoRecipient){
        return new ProdutoDTO(produtoRecipient.getNome(), produtoRecipient.getDescricao(), produtoRecipient.getPreco());
    }

    public static Produto dTOtoModel(ProdutoDTO produtoDTO){
        return new Produto(produtoDTO.nome, produtoDTO.descricao, produtoDTO.preco);
    }
}
