package exercicioRelampagoSurpresaPi;

public class TipoEnsino {
    String tipo;

    public TipoEnsino(String tipo){
        this.setNome(tipo);
    }

    public String getNome() {
        return this.tipo;
    }

    public void setNome(String tipo){
        if(tipo == null || tipo.trim().isEmpty()){
            throw new IllegalArgumentException("O tipo de Ensino não pode estar vazio");
        }
        this.tipo = tipo;
    }
}
