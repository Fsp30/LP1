package if_oo_20261_heranca;

public abstract class Funcionario {
    
    protected float salarioMensal; 

    public void setSalarioMensal(float salarioMensal) {
        if (salarioMensal < 0.0f) {
            throw new IllegalArgumentException("O salario não pode ser negativo");
        } else {
            this.salarioMensal = salarioMensal;
        }
    }

    public float getSalarioMensal() {
        float resposta = 0.0f;
        resposta = this.salarioMensal;
        return resposta;
    }

    public abstract float calcularPagamento();
}
