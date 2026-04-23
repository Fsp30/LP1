package if_oo_20261_heranca;

public abstract class Funcionario implements IFuncionario {
    
    protected float salarioMensal; 

    public void setSalarioMensal(float salarioMensal) {
        if (salarioMensal <= 0.0f) {
            throw new IllegalArgumentException("O salario deve ser maior que zero");
        }
        this.salarioMensal = salarioMensal;
    }

    public float getSalarioMensal() {
        float resposta = 0.0f;
        resposta = this.salarioMensal;
        return resposta;
    }

    public String gerarHolerite() {
        String resposta = "";
        float valorFinal = 0.0f;
        
        valorFinal = this.calcularPagamento();
        resposta = "Holerite processado. Valor a receber: R$ " + valorFinal;
        
        return resposta;
    }
}
