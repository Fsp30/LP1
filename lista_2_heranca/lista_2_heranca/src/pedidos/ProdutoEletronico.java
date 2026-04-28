package lista_2_heranca.pedidos;

public class ProdutoEletronico extends Produto{
    public ProdutoEletronico(float precoBase){
        super(precoBase);
    }

    public float PercentualDeDesconto() {
        return 0.90f;
    }
}