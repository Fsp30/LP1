package if_oo_20261_heranca;

public class AlimentoLoja extends ProdutoLoja {

    public AlimentoLoja(String nome, float precoUnitario, float quantidadeEstoque) {
        setNome(nome);
        setPrecoUnitario(precoUnitario);
        setQuantidadeEstoque(quantidadeEstoque);
    }

    @Override
    public float calcularPreco(float quantidadeEmQuilos) {
        float resposta = 0.0f;
        resposta = this.precoUnitario * quantidadeEmQuilos; 
        return resposta;
    }
}
