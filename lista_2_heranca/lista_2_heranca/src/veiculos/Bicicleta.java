package lista_2_heranca.veiculos;

public class Bicicleta extends Veiculo {
    public Bicicleta(String marca, String modelo, float precoBase) {
        super(marca, modelo, precoBase);
    }

    @Override
    public float calcularCusto() {
        return this.precoBase * this.fatorBicicleta();
    }

    public float fatorBicicleta(){
        return 1.05f;
    }
}