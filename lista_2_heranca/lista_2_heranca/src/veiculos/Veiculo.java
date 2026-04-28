package lista_2_heranca.veiculos;

public abstract class Veiculo {
    private String marca;
    private String modelo;
    protected float precoBase;

    public Veiculo(String marca, String modelo, float precoBase) {
        setMarca(marca);
        setModelo(modelo);
        setPrecoBase(precoBase);
    }

    void setMarca(String marca){
        if(marca == null || marca.trim().isEmpty()){
            throw new IllegalArgumentException("O nome da marca não pode ser vazio.");
        }
        this.marca = marca;
    }

    void setModelo(String modelo){
        if(modelo == null || modelo.trim().isEmpty()){
            throw new IllegalArgumentException("O nome do modelo não pode ser vazio.");
        }
        this.modelo = modelo;
    }

    void setPrecoBase(float precoBase){
        if(precoBase <= 0){
            throw new IllegalArgumentException("O preço base do veiculo não pode ser negatico ou zero");
        }
        this.precoBase = precoBase;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public float getPrecoBase() {
        return precoBase;
    }

    public abstract float calcularCusto();

    public String exibirDados() {
        return this.modelo + " - Custo Final: R$ " + calcularCusto();
    }
}