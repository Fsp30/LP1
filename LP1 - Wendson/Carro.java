public class Carro {
    private String marca;
    private String modelo;
    private int ano;
    private float velocidadeAtual;
    private boolean estado;

    public Carro(String marca, String modelo, int ano) {
        setMarca(marca);
        setModelo(modelo);
        setAno(ano);
        this.velocidadeAtual = 0.0f;
        this.estado = false;
    }

    public void setMarca(String marca) {
        if (marca == null || marca.trim().isEmpty()) {
            throw new IllegalArgumentException("A marca não pode ser vazia");
        }
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        if (modelo == null || modelo.trim().isEmpty()) {
            throw new IllegalArgumentException("O modelo não pode ser vazio");
        }
        this.modelo = modelo;
    }

    public void setAno(int ano) {
        if (ano < 1886) { 
            throw new IllegalArgumentException("Ano invalido para um carro");
        }
        this.ano = ano;
    }

    public void setVelocidadeAtual(float velocidadeAtual) {
        if (velocidadeAtual < 0.0f) {
            throw new IllegalArgumentException("A velocidade não pode ser negativa");
        }
        this.velocidadeAtual = velocidadeAtual;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
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
    
    public int getAno() { 
        int resposta = 0;
        resposta = this.ano;
        return resposta; 
    }
    
    public float getVelocidadeAtual() { 
        float resposta = 0.0f;
        resposta = this.velocidadeAtual;
        return resposta; 
    }
    
    public boolean getEstado() { 
        boolean resposta = false;
        resposta = this.estado;
        return resposta; 
    }

    public void ligar() {
        this.estado = true;
    }

    public void desligar() {
        this.estado = false;
        this.velocidadeAtual = 0.0f; 
    }

    public void acelerar(float quantidade) {
        if (quantidade < 0.0f) {
            throw new IllegalArgumentException("A quantidade a acelerar não pode ser negativa");
        } else {
            if (!this.estado) {
                throw new IllegalStateException("O carro precisa estar ligado para acelerar");
            } else {
                this.velocidadeAtual = this.velocidadeAtual + quantidade;
            }
        }
    }

    public void frear(float quantidade) {
        if (quantidade < 0.0f) {
            throw new IllegalArgumentException("A quantidade a frear não pode ser negativa");
        } else {
            if (this.velocidadeAtual - quantidade < 0.0f) {
                this.velocidadeAtual = 0.0f; 
            } else {
                this.velocidadeAtual = this.velocidadeAtual - quantidade;
            }
        }
    }
}

