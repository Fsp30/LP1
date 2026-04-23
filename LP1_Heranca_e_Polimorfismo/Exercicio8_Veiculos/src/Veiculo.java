package if_oo_20261_heranca;

public abstract class Veiculo implements IVeiculo {
    
    protected String marca;
    protected String modelo;
    protected float valorDiaria;

    public void setMarca(String marca) {
        if (marca == null || marca.trim().isEmpty()) {
            throw new IllegalArgumentException("A marca nao pode ser vazia");
        }
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        if (modelo == null || modelo.trim().isEmpty()) {
            throw new IllegalArgumentException("O modelo nao pode ser vazio");
        }
        this.modelo = modelo;
    }

    public void setValorDiaria(float valorDiaria) {
        if (valorDiaria <= 0.0f) {
            throw new IllegalArgumentException("O valor da diaria deve ser maior que zero");
        }
        this.valorDiaria = valorDiaria;
    }

    public String getMarca() {
        String resposta = "";
        resposta = this.marca;
        return resposta;
    }

    public String getModelo() {
        String resposta = "";
        resposta = this.modelo;
        return resposta;
    }

    public float getValorDiaria() {
        float resposta = 0.0f;
        resposta = this.valorDiaria;
        return resposta;
    }

    public String gerarContratoLocacao(int dias) {
        String resposta = "";
        float valorFinal = 0.0f;
        
        if (dias <= 0) {
            throw new IllegalArgumentException("A quantidade de dias deve ser maior que zero");
        }
        
        valorFinal = this.calcularAluguel(dias);
        
        resposta = "Contrato | Veiculo: " + this.marca + " " + this.modelo + " | Dias: " + dias + " | Total: R$ " + valorFinal;
        return resposta;
    }
}
