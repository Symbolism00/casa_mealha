package backoffice.repository.concretes;

import backoffice.model.Produto;
import backoffice.repository.abstracts.IProdutoRepository;
import org.springframework.stereotype.Repository;

@Repository("testRepository")
public class ProdutoRepository implements IProdutoRepository {

    public boolean saveProdutoRecipient(Produto produto) {
        MainRepository repo = MainRepository.getInstance();
        return repo.save(produto);
    }
}
