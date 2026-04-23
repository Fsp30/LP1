package lista_2_heranca.biblioteca;

import java.time.LocalDate;

public abstract class MaterialBiblioteca {
    private String titulo;
    private int anoPublicacao;

    public MaterialBiblioteca(String titulo, int anoPublicacao) {
        this.titulo = titulo;
        this.anoPublicacao = anoPublicacao;
    }

    public abstract LocalDate calcularDataDevolucao(LocalDate dataEmprestimo);

    public String getTitulo() { return titulo; }
}
