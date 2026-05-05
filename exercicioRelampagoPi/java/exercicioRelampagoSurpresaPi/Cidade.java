package exercicioRelampagoSurpresaPi;

public class Cidade {
    private String nome;
    private Estado estado;

    public Cidade(String nome, Estado estado) {
        this.setNome(nome);
        this.setEstado(estado);
    }

    public String getNome(){ return this.nome; }

    public void setNome(String nome){
        if(nome == null || nome.trim().isEmpty()){
            throw new IllegalArgumentException("O nome da cidade não pode ser vazio");
        }
        this.nome = nome;
    }

    public Estado getEstado() {
        return this.estado;
    }

    public void setEstado(Estado estado) {
        if (estado == null) {
            throw new IllegalArgumentException("Estado obrigatorio");
        }
        this.estado = estado;
    }

    public String getNomeEstado() {
        return this.estado.getNome();
    }
}
