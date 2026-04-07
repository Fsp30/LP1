public class Pessoa {
    private String nome;
    private int idade;
    private int altura;
    private float peso;

    public void setNome(String nome){
        if(nome.trim().isEmpty()){
            throw new IllegalArgumentException("A pessoa deve ter um nome");
        }
        this.nome = nome;
    }

    public void setIdade(int idade){
        if(idade < 0){
            throw new IllegalArgumentException("O valor da idade não pode ser negativo");
        }
        this.idade = idade;
    }

    public void setAltura(int altura){
        if(altura < 0){
            throw new IllegalArgumentException("O valor da altura não pode ser negativo");
        }
        this.altura = altura;
    }

    public void setPeso(float peso){
        if(peso < 0){
            throw new IllegalArgumentException("O valor do peso não pode ser negativo");
        }
        this.peso = peso;
    }

    public String getNome(){ return this.nome; }
    public int getIdade(){ return this.idade; }
    public int getAltura(){ return  this.altura; }
    public float getPeso(){ return this.peso; }

    public void envelhecer(){
        this.idade += 1;
    }

    public void crescer(int centimetros){
        if(centimetros < 1){
            throw new IllegalArgumentException("Não se pode crescer um valor abaixo de 1 centímetro");
        }
        if(this.idade > 21){
            throw  new IllegalArgumentException("Não se pode crescer após os 21 anos");
        }
        this.altura += centimetros;
    }

    public void ganharPeso(float quilos){
        if(quilos < 0){
            throw new IllegalArgumentException("Não se pode ganahr pesos de valor negativo");
        }
        this.peso += quilos;
    }
    public void perderPeso(float quilos){
        if(quilos < 0){
            throw new IllegalArgumentException("Não se pode perder pesos de valor negativo");
        }
        if(this.peso - quilos < 0){
            throw new IllegalArgumentException("O peso da pessoa não pode ser negativo");
        }
        this.peso -= quilos;
    }


}
