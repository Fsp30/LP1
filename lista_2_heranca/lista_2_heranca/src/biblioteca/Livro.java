package lista_2_heranca.biblioteca;

import java.time.LocalDate;

public class Livro extends MaterialBiblioteca {
    public Livro(String titulo, int ano) { super(titulo, ano); }

    @Override
    public LocalDate calcularDataDevolucao(LocalDate dataEmprestimo) {
        return dataEmprestimo.plusDays(15);
    }
}
