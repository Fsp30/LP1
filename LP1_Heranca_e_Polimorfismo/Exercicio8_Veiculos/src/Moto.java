package if_oo_20261_heranca;

public class Moto extends Veiculo {

    public Moto(String marca, String modelo, float valorDiaria) {
        setMarca(marca);
        setModelo(modelo);
        setValorDiaria(valorDiaria);
    }

    @Override
    public float calcularAluguel(int dias) {
        float resposta = 0.0f;
        resposta = this.valorDiaria * dias; 
        return resposta;
    }
}
