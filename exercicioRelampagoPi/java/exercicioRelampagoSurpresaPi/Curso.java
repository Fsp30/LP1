package exercicioRelampagoSurpresaPi;

public class Curso {
    Professor coordenador;
    Escola escola;
    TipoEnsino tipoEnsino;

    public Curso(Professor coordenador, TipoEnsino tipoEnsino){
        setCoordenador(coordenador);
        setTipoEnsino(tipoEnsino);
    }

    public Escola getEscola(){ return this.escola; }
    public Professor getCoordenador(){
        return this.coordenador;
    }
    public TipoEnsino getTipoEnsino(){return this.tipoEnsino; }

    public void setEscola(Escola escola){
        if(escola == null){
            throw new IllegalArgumentException("Modelo de Escola incorreto");
        }
        this.escola = escola;
    }

    public void setCoordenador(Professor coordenador){
        if(coordenador == null){
            throw new IllegalArgumentException("O Curso precisa de um coordenador");
        }
        this.coordenador = coordenador;
    }

    public String getEstadoDoCurso(){
        return this.escola.getNomeDoEstadoDaEscola();
    }

    public String getNomeTipoDeEnsino(){
        return this.tipoEnsino.getNome();
    }

    public void setTipoEnsino(TipoEnsino tipoEnsino){
        if(tipoEnsino == null){
            throw new IllegalArgumentException("O tipo Ensino não pode ser vazio");
        }
        this.tipoEnsino = tipoEnsino;
    }


    public String getNomeEscolaridadeCoordenador(){
        return this.coordenador.getNomeEscolaridade();
    }
}
