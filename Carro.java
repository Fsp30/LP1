
public class Carro {
    private String marca;
    private String modelo;
    private int ano;
    private float velocidadeAtual;
    private boolean estado;

    public void setMarca(String marca){
        if(marca.trim().isEmpty()){
            throw new IllegalArgumentException("O nome de marca não pode estar vazio");
        }
        this.marca = marca;
    }

    public void setModelo(String modelo){
        if(modelo.trim().isEmpty()){
            throw new IllegalArgumentException("O nome do modelo não pode estar vazio");
        }
        this.modelo = modelo;
    }

    public void setAno(int ano){
        if(ano < 0){
            throw new IllegalArgumentException("O ano do carro não pode possuir valor negativo");
        }
        this.ano = ano;
    }

    public void setVelocidadeAtual(float velocidadeAtual){
        if (velocidadeAtual < 0){
            throw new IllegalArgumentException("A velocidade atual do carro não pode ser negativa");
        }
        this.velocidadeAtual = velocidadeAtual;
    }

    public void setEstado(boolean novoEstado){
        if(this.estado == novoEstado){
            throw new IllegalArgumentException("A ação deve inverter o estado do carro (ligado ou desligado)");
        }
        this.estado = novoEstado;
    }

    public String getMarca(){
        return this.marca;
    }

    public String getModelo(){
        return this.modelo;
    }

    public int getAno(){
        return this.ano;
    }

    public float getVelocidadeAtual(){
        return this.velocidadeAtual;
    }

    public boolean getEstado(){
        return this.estado;
    }

    public void ligarCarro(boolean estado){
        if(this.velocidadeAtual > 0){
            throw new IllegalArgumentException("Não se pode ligar o carro andando");
        }
        this.setEstado(estado);
    }

    public void desligarCarro(boolean estado){
        if(this.velocidadeAtual > 0){
            throw new IllegalArgumentException("Não se pode desligar o carro andando");
        }
        this.setEstado(estado);
    }

    public void acelerar(float velocidade){
        if(!this.estado){
            throw new IllegalArgumentException("O carro deve estar ligado para acelerar");
        }
        if(velocidade <= 0){
            throw new IllegalArgumentException("O carro deve acelerar um valor positivo acima de zero");
        }
        this.velocidadeAtual += velocidade;
    }

    public void frear(float velocidade){
        if(!this.estado){
            throw new IllegalArgumentException("O carro deve estar ligado para desacelerar");
        }
        if(velocidade <= 0){
            throw new IllegalArgumentException("O carro deve desacelerar um valor positivo acima de zero");
        }

        if(this.velocidadeAtual - velocidade < 0) {
            this.velocidadeAtual = 0;
        }
        this.velocidadeAtual -= velocidade;
    }



}
