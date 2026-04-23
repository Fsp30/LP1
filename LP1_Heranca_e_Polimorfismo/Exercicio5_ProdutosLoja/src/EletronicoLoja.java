package if_oo_20261_heranca;

public class EletronicoLoja extends ProdutoLoja {

    public EletronicoLoja(String nome, float precoUnitario, float quantidadeEstoque) {
        setNome(nome);
        setPrecoUnitario(precoUnitario);
        setQuantidadeEstoque(quantidadeEstoque);
    }

    @Override
    public float calcularPreco(float quantidade) {
        float resposta = 0.0f;
        resposta = this.precoUnitario * quantidade; 
        return resposta;
    }
}
