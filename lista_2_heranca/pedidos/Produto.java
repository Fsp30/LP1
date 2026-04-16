package lista_2_heranca.pedidos;

public abstract class Produto {
    public String nome;
    public float precoBase;

    public abstract float calcularPreco();
    public abstract float calcularDesconto();
}
