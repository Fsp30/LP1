package lista_2_heranca.gerenciamento_produtos;
public class ProdutosAlimentos extends Produtos {

    public ProdutosAlimentos(String nome, float precoUnitario, float quantidadeEstoqueEmQuilos) {
        super(nome, precoUnitario, quantidadeEstoqueEmQuilos);
    }

    public float calcularPreco(float quantidadeCompradaEmQuilos) {
        if(quantidadeCompradaEmQuilos < 0.1f) {
            throw new IllegalArgumentException("Não se pode comprar menos do que 100g");
        }

        float precoTotal = this.getPrecoUnitario() * quantidadeCompradaEmQuilos;
        this.atualizarEstoque(quantidadeCompradaEmQuilos);
        return precoTotal;
    }
}