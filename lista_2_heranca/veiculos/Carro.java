package lista_2_heranca.veiculos;

public class Carro extends Veiculo {
    public Carro(String marca, String modelo, float precoBase) {
        super(marca, modelo, precoBase);
    }

    @Override
    public float calcularCusto() {
        return this.precoBase * this.fatorCarro();
    }

    public float fatorCarro(){
        return 1.50f;
    }
}