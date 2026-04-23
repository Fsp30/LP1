package if_oo_20261_heranca;

public class VooDomestico extends Voo {
    
    private float fatorPreco;

    public VooDomestico(String origem, String destino, float distancia, String dataVoo, float fatorPreco) {
        setOrigem(origem);
        setDestino(destino);
        setDistancia(distancia);
        setDataVoo(dataVoo);
        setFatorPreco(fatorPreco);
    }

    public void setFatorPreco(float fatorPreco) {
        if (fatorPreco <= 0.0f) {
            throw new IllegalArgumentException("O fator de preco deve ser maior que zero");
        }
        this.fatorPreco = fatorPreco;
    }

    public float getFatorPreco() {
        float resposta = 0.0f;
        resposta = this.fatorPreco;
        return resposta;
    }

    @Override
    public float calcularPreco() {
        float resposta = 0.0f;
        resposta = this.distancia * this.fatorPreco;
        return resposta;
    }
}
