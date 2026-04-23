package lista_2_heranca.veiculos;

public abstract class Veiculo {
    private String marca;
    private String modelo;
    protected float precoBase;

    public Veiculo(String marca, String modelo, float precoBase) {
        this.marca = marca;
        this.modelo = modelo;
        this.precoBase = precoBase;
    }

    public abstract float calcularCusto();

    public String exibirDados() {
        return this.modelo + " - Custo Final: R$ " + calcularCusto();
    }
}