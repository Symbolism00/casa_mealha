package backoffice.service.concretes;

import backoffice.dto.ProdutoDTO;
import backoffice.mapper.ProdutoMapper;
import backoffice.model.Produto;
import backoffice.repository.abstracts.IProdutoRepository;
import backoffice.service.abstracts.IProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("testService")
public class ProdutoService implements IProdutoService {

    private IProdutoRepository produtoRepository;

    public boolean saveProdutoRecipient(ProdutoDTO produtoDTO) {
        Produto produto = ProdutoMapper.dTOtoModel(produtoDTO);
        return produtoRepository.saveProdutoRecipient(produto);
    }

    @Autowired
    public void setTestRepository(IProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }
}
