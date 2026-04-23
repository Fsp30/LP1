package if_oo_20261_heranca;

public class RoupaLoja extends ProdutoLoja {

    private float desconto;

    public RoupaLoja(String nome, float precoUnitario, float quantidadeEstoque, float desconto) {
        setNome(nome);
        setPrecoUnitario(precoUnitario);
        setQuantidadeEstoque(quantidadeEstoque);
        setDesconto(desconto);
    }

    public void setDesconto(float desconto) {
        if (desconto < 0.0f) {
            throw new IllegalArgumentException("O desconto nao pode ser negativo");
        }
        this.desconto = desconto;
    }

    public float getDesconto() {
        float resposta = 0.0f;
        resposta = this.desconto;
        return resposta;
    }

    @Override
    public float calcularPreco(float quantidade) {
        float resposta = 0.0f;
        float valorBruto = 0.0f;
        
        valorBruto = this.precoUnitario * quantidade;
        resposta = valorBruto - this.desconto; 
        
        return resposta;
    }
}
