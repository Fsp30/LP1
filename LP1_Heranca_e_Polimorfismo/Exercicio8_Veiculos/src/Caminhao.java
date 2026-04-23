package if_oo_20261_heranca;

public class Caminhao extends Veiculo {

    private float taxaCargaPorDia;

    public Caminhao(String marca, String modelo, float valorDiaria, float taxaCargaPorDia) {
        setMarca(marca);
        setModelo(modelo);
        setValorDiaria(valorDiaria);
        setTaxaCargaPorDia(taxaCargaPorDia);
    }

    public void setTaxaCargaPorDia(float taxaCargaPorDia) {
        if (taxaCargaPorDia < 0.0f) {
            throw new IllegalArgumentException("A taxa de carga nao pode ser negativa");
        }
        this.taxaCargaPorDia = taxaCargaPorDia;
    }

    @Override
    public float calcularAluguel(int dias) {
        float resposta = 0.0f;
        float diariaComCarga = 0.0f;
        
        diariaComCarga = this.valorDiaria + this.taxaCargaPorDia;
        resposta = diariaComCarga * dias;
        
        return resposta;
    }
}
