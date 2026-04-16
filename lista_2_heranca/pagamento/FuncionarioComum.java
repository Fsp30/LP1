package lista_2_heranca.pagamento;

public class FuncionarioComum extends Funcionario{
    private Funcionario funcionarioComum;

    public float calcularPagamento() {
        return funcionarioComum.salarioBase;
    }
}