package exercicioRelampagoSurpresaPi;

public class Escola {
    String nome;
    Professor diretor;
    Cidade cidade;
    Estado estado;

    public Escola(String nome, Professor diretor){
        this.setNome(nome);
        this.setDiretor(diretor);
    }
    public Professor getDiretor(){
        return this.diretor;
    }
    public Cidade getCidade() { return cidade; }

    public String getNome(){ return this.nome; }
    public void setNome(String nome){
        if(nome == null || nome.trim().isEmpty()){
            throw new IllegalArgumentException("O nome da escola não pode ser vazio");
        }
        this.nome = nome;
    }

    public void setDiretor(Professor diretor) {
        if(diretor == null){
            throw new IllegalArgumentException("A Escola precisa de um diretor");
        }
        this.diretor = diretor;
    }

    public void setCidade(Cidade cidade){
        if(cidade == null){
            throw new IllegalArgumentException("Cidade não pode estar vazia");
        }
        this.cidade = cidade;
    }

    public String getNomeDoEstadoDaEscola(){
        return this.cidade.getNomeEstado();
    }



    public String getNomeEscolaridadeDiretor(){
        return this.diretor.getNomeEscolaridade();
    }
}
