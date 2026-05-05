package exercicioRelampagoSurpresaPi;

public class Pessoa {

    private Escolaridade escolaridade;
    private Cidade naturalidade;

    public Escolaridade getEscolaridade() {
        return this.escolaridade;
    }

    public void setEscolaridade(Escolaridade escolaridade) {
        this.escolaridade = escolaridade;
    }

    public Cidade getNaturalidade() {
        return this.naturalidade;
    }

    public void setNaturalidade(Cidade naturalidade) {
        this.naturalidade = naturalidade;
    }

    public String getNomeEscolaridade() {
        if (this.escolaridade == null) {
            throw new NullPointerException("Pessoa sem escolaridade");
        }
        return this.escolaridade.getNome();
    }

    public String getNomeEstadoNaturalidade() {
        if (this.naturalidade == null) {
            throw new NullPointerException("Pessoa sem naturalidade");
        }
        return this.naturalidade.getNomeEstado();
    }

    public String getNomeCidadeNaturalidade(){
        if (this.naturalidade == null) {
            throw new NullPointerException("Pessoa sem naturalidade");
        }
        return this.naturalidade.getNome();
    }
}
