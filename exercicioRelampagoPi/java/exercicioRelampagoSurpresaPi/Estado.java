package exercicioRelampagoSurpresaPi;

public class Estado {
    private String nome;

    public Estado(String nome){
        setNome(nome);
    }


    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        if(nome == null || nome.trim().isEmpty()){
            throw new IllegalArgumentException("O nome do Estado não pode estar vazio");
        }
        this.nome = nome;
    }
}