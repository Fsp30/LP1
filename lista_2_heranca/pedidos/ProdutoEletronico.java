package lista_2_heranca.pedidos;

public class ProdutoEletronico extends Produto{

    private float precoVarejo;


    @Override
    public float calcularDesconto() {
        return this.precoBase * 0.10f;
    }

    public void setPrecoVarejo() {
        this.precoVarejo = this.precoBase;
    }

    public float getPrecoVarejo(){ return this.precoVarejo; }

    @Override
    public float calcularPreco() {
        return this.precoVarejo - calcularDesconto();
    }
}
