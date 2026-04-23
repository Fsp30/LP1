package if_oo_20261_heranca;

public class FuncionarioComum extends Funcionario {

    public FuncionarioComum(float salarioMensal) {
        setSalarioMensal(salarioMensal);
    }

    @Override
    public float calcularPagamento() {
        float resposta = 0.0f;
        resposta = this.salarioMensal;
        return resposta;
    }
}
