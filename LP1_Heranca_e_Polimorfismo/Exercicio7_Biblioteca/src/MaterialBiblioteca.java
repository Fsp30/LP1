package if_oo_20261_heranca;

public abstract class MaterialBiblioteca implements IMaterialBiblioteca {
    
    protected String titulo;
    protected String dataPublicacao;

    public void setTitulo(String titulo) {
        if (titulo == null || titulo.trim().isEmpty()) {
            throw new IllegalArgumentException("O titulo nao pode ser vazio");
        }
        this.titulo = titulo;
    }

    public void setDataPublicacao(String dataPublicacao) {
        if (dataPublicacao == null || dataPublicacao.trim().isEmpty()) {
            throw new IllegalArgumentException("A data de publicacao nao pode ser vazia");
        }
        this.dataPublicacao = dataPublicacao;
    }

    public String getTitulo() {
        String resposta = "";
        resposta = this.titulo;
        return resposta;
    }

    public String gerarComprovanteEmprestimo(int diaEmprestimo) {
        String resposta = "";
        int diaDevolucao = 0;
        
        if (diaEmprestimo <= 0 || diaEmprestimo > 31) {
            throw new IllegalArgumentException("Dia de emprestimo invalido");
        }
        
        diaDevolucao = this.calcularDataDevolucao(diaEmprestimo);
        
        resposta = "Emprestimo: " + this.titulo + " | Devolver no dia: " + diaDevolucao;
        return resposta;
    }
}
