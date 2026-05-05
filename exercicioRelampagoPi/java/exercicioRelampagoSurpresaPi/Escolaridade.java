package exercicioRelampagoSurpresaPi;

public class Escolaridade {
    private String nome;

    public Escolaridade(String nome){
        setNome(nome);
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        if(nome == null || nome.trim().isEmpty()){
            throw new IllegalArgumentException("O nome da escolaridade não pode estar vazio");
        }
        this.nome = nome;
    }
}
