package lista_2_heranca.pedidos;

public class ProdutoRoupa extends Produto{
    public ProdutoRoupa(float precoEtiqueta){
        super(precoEtiqueta);
    }

    public float PercentualDeDesconto() {
        return 0.8f;
    }
}
