public class Pessoa {
    private String nome;
    private int idade;
    private float altura;
    private float peso;

    public Pessoa(String nome, int idade, float altura, float peso) {
        setNome(nome);
        setIdade(idade);
        setAltura(altura);
        setPeso(peso);
    }

    public void setNome(String nome) {
        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("O nome não pode ser vazio");
        }
        this.nome = nome;
    }

    public void setIdade(int idade) {
        if (idade < 0) {
            throw new IllegalArgumentException("A idade não pode ser negativa");
        }
        this.idade = idade;
    }

    public void setAltura(float altura) {
        if (altura <= 0.0f) {
            throw new IllegalArgumentException("A altura deve ser maior que zero");
        }
        this.altura = altura;
    }

    public void setPeso(float peso) {
        if (peso <= 0.0f) {
            throw new IllegalArgumentException("O peso deve ser maior que zero");
        }
        this.peso = peso;
    }

    public String getNome() { 
        String resposta = ""; 
        resposta = this.nome; 
        return resposta; 
    }
    
    public int getIdade() { 
        int resposta = 0; 
        resposta = this.idade; 
        return resposta; 
    }
    
    public float getAltura() { 
        float resposta = 0.0f; 
        resposta = this.altura; 
        return resposta; 
    }
    
    public float getPeso() { 
        float resposta = 0.0f; 
        resposta = this.peso; 
        return resposta; 
    }

    public void envelhecer() {
        this.idade = this.idade + 1;
    }

    public void crescer(float centimetros) {
        if (centimetros <= 0.0f) {
            throw new IllegalArgumentException("Valor deve ser maior que zero");
        } else {
            if (this.idade > 21) { 
                throw new IllegalStateException("A pessoa não pode crescer com 21 anos ou mais");
            } else {
                this.altura = this.altura + centimetros;
            }
        }
    }

    public void ganhar_peso(float quilos) {
        if (quilos <= 0.0f) {
            throw new IllegalArgumentException("Valor deve ser maior que zero");
        } else {
            this.peso = this.peso + quilos;
        }
    }

    public void perder_peso(float quilos) {
        if (quilos <= 0.0f) {
            throw new IllegalArgumentException("Valor deve ser maior que zero");
        } else {
            this.peso = this.peso - quilos; 
        }
    }
}

