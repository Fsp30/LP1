package lista_2_heranca.veiculos;

public class Moto extends Veiculo {
    public Moto(String marca, String modelo, float precoBase) {
        super(marca, modelo, precoBase);
    }

    @Override
    public float calcularCusto() {
        return this.precoBase * this.fatorMoto();
    }

    public float fatorMoto(){
        return 1.20f;
    }

}