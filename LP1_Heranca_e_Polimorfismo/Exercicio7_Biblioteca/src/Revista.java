package if_oo_20261_heranca;

public class Revista extends MaterialBiblioteca {

    public Revista(String titulo, String dataPublicacao) {
        setTitulo(titulo);
        setDataPublicacao(dataPublicacao);
    }

    @Override
    public int calcularDataDevolucao(int diaEmprestimo) {
        int resposta = 0;
        resposta = diaEmprestimo + 7;
        return resposta;
    }
}
