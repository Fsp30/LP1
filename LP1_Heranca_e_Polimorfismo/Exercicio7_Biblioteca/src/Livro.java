package if_oo_20261_heranca;

public class Livro extends MaterialBiblioteca {

    public Livro(String titulo, String dataPublicacao) {
        setTitulo(titulo);
        setDataPublicacao(dataPublicacao);
    }

    @Override
    public int calcularDataDevolucao(int diaEmprestimo) {
        int resposta = 0;
        resposta = diaEmprestimo + 15;
        return resposta;
    }
}
