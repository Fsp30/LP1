package if_oo_20261_heranca;

public abstract class Voo implements IVoo {
    
    protected String origem;
    protected String destino;
    protected float distancia;
    protected String dataVoo;

    public void setOrigem(String origem) {
        if (origem == null || origem.trim().isEmpty()) {
            throw new IllegalArgumentException("A origem nao pode ser vazia");
        }
        this.origem = origem;
    }

    public void setDestino(String destino) {
        if (destino == null || destino.trim().isEmpty()) {
            throw new IllegalArgumentException("O destino nao pode ser vazio");
        }
        this.destino = destino;
    }

    public void setDistancia(float distancia) {
        if (distancia <= 0.0f) {
            throw new IllegalArgumentException("A distancia deve ser maior que zero");
        }
        this.distancia = distancia;
    }

    public void setDataVoo(String dataVoo) {
        if (dataVoo == null || dataVoo.trim().isEmpty()) {
            throw new IllegalArgumentException("A data do voo nao pode ser vazia");
        }
        this.dataVoo = dataVoo;
    }

    public String getOrigem() {
        String resposta = "";
        resposta = this.origem;
        return resposta;
    }

    public String getDestino() {
        String resposta = "";
        resposta = this.destino;
        return resposta;
    }

    public float getDistancia() {
        float resposta = 0.0f;
        resposta = this.distancia;
        return resposta;
    }

    public String getDataVoo() {
        String resposta = "";
        resposta = this.dataVoo;
        return resposta;
    }

    public String gerarBilhete() {
        String resposta = "";
        float precoFinal = 0.0f;
        
        precoFinal = this.calcularPreco();
        resposta = "Bilhete: " + this.origem + " para " + this.destino + " (" + this.dataVoo + ") - Valor: R$ " + precoFinal;
        
        return resposta;
    }
}
