package lista_2_heranca.gerenciamento_produtos;

public class ProdutosEletronicos extends Produtos {
    public ProdutosEletronicos(String nome, float precoUnitario, int quantidadeEstoque){
        super(nome, precoUnitario, (float) quantidadeEstoque);
    }

    @Override
    public float calcularPreco(float quantidadeComprada) {
        if (quantidadeComprada % 1 != 0) {
            throw new IllegalArgumentException("Eletrônicos só podem ser comprados em quantidades inteiras");
        }
        float resultado = this.getPrecoUnitario() * quantidadeComprada;
        this.atualizarEstoque(quantidadeComprada);
        return resultado;
    }
}
