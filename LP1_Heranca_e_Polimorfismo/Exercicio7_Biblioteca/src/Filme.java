package if_oo_20261_heranca;

public class Filme extends MaterialBiblioteca {

    public Filme(String titulo, String dataPublicacao) {
        setTitulo(titulo);
        setDataPublicacao(dataPublicacao);
    }

    @Override
    public int calcularDataDevolucao(int diaEmprestimo) {
        int resposta = 0;
        resposta = diaEmprestimo + 5;
        return resposta;
    }
}
