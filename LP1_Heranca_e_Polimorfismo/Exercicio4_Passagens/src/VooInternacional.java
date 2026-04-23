package if_oo_20261_heranca;

public class VooInternacional extends Voo {
    
    private float fatorPreco;
    private float taxaConversao;

    public VooInternacional(String origem, String destino, float distancia, String dataVoo, float fatorPreco, float taxaConversao) {
        setOrigem(origem);
        setDestino(destino);
        setDistancia(distancia);
        setDataVoo(dataVoo);
        setFatorPreco(fatorPreco);
        setTaxaConversao(taxaConversao);
    }

    public void setFatorPreco(float fatorPreco) {
        if (fatorPreco <= 0.0f) {
            throw new IllegalArgumentException("O fator de preco deve ser maior que zero");
        }
        this.fatorPreco = fatorPreco;
    }

    public void setTaxaConversao(float taxaConversao) {
        if (taxaConversao < 0.0f) {
            throw new IllegalArgumentException("A taxa de conversao nao pode ser negativa");
        }
        this.taxaConversao = taxaConversao;
    }

    public float getFatorPreco() {
        float resposta = 0.0f;
        resposta = this.fatorPreco;
        return resposta;
    }

    public float getTaxaConversao() {
        float resposta = 0.0f;
        resposta = this.taxaConversao;
        return resposta;
    }

    @Override
    public float calcularPreco() {
        float resposta = 0.0f;
        float precoBase = 0.0f;
        
        precoBase = this.distancia * this.fatorPreco;
        resposta = precoBase + this.taxaConversao;
        
        return resposta;
    }
}
