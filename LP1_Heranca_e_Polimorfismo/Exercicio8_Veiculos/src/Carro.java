package if_oo_20261_heranca;

public class Carro extends Veiculo {

    private float taxaSeguro;

    public Carro(String marca, String modelo, float valorDiaria, float taxaSeguro) {
        setMarca(marca);
        setModelo(modelo);
        setValorDiaria(valorDiaria);
        setTaxaSeguro(taxaSeguro);
    }

    public void setTaxaSeguro(float taxaSeguro) {
        if (taxaSeguro < 0.0f) {
            throw new IllegalArgumentException("A taxa de seguro nao pode ser negativa");
        }
        this.taxaSeguro = taxaSeguro;
    }

    @Override
    public float calcularAluguel(int dias) {
        float resposta = 0.0f;
        float valorDiarias = 0.0f;
        
        valorDiarias = this.valorDiaria * dias;
        resposta = valorDiarias + this.taxaSeguro; 
        
        return resposta;
    }
}
