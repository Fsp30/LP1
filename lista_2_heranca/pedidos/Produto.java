package lista_2_heranca.pedidos;

public abstract class Produto {
    private float precoBase;

    public Produto(float precoBase) {
        setPrecoBase(precoBase);
    }

    public void setPrecoBase(float precoBase){
        if(precoBase < 0){
            throw new IllegalArgumentException("O valor do produto não pode ser negativo");
        }
        this.precoBase = precoBase;
    }

    public abstract float PercentualDeDesconto();

    public float calcularPreco(){
     return this.precoBase *  this.PercentualDeDesconto();
    }
}
