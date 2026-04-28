package lista_2_heranca.pedidos;

public class ProdutoLivro extends Produto{

    public ProdutoLivro(float precoBase) {
        super(precoBase);
    }

    public float PercentualDeDesconto() {
        return 0.95f;
    }
}
