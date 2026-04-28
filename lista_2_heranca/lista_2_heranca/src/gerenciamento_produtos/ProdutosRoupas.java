package lista_2_heranca.gerenciamento_produtos;

public class ProdutosRoupas extends Produtos {
    public ProdutosRoupas(String nome, float precoUnitario, int quantidadeEstoque){
        super(nome, precoUnitario, (float) quantidadeEstoque);
    }

    public float getPercentualDesconto(){
        return 0.95f;
    }

    @Override
    public float calcularPreco(float quantidadeComprada){
        if (quantidadeComprada % 1 != 0) {
            throw new IllegalArgumentException("Roupas só podem ser compradas em quantidades inteiras");
        }

        float precoTotal = this.getPrecoUnitario() * quantidadeComprada;

        if(quantidadeComprada > 9){
            precoTotal *= getPercentualDesconto();
        }

        this.atualizarEstoque(quantidadeComprada);
        return precoTotal;
    }
}