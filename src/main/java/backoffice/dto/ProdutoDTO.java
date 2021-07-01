package backoffice.dto;

public class ProdutoDTO {

    public String nome;
    public String descricao;
    public String preco;

    public ProdutoDTO(String nome, String descricao, String preco) {
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
    }
}
