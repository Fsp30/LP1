package if_oo_20261_heranca;

public abstract class ContaBancaria implements IContaBancaria {
    
    protected String numeroConta;
    protected String titular;
    protected float saldo;

    public void setNumeroConta(String numeroConta) {
        if (numeroConta == null || numeroConta.trim().isEmpty()) {
            throw new IllegalArgumentException("O numero da conta nao pode ser vazio");
        }
        this.numeroConta = numeroConta;
    }

    public void setTitular(String titular) {
        if (titular == null || titular.trim().isEmpty()) {
            throw new IllegalArgumentException("O titular nao pode ser vazio");
        }
        this.titular = titular;
    }

    public void setSaldo(float saldo) {
        if (saldo < 0.0f) {
            throw new IllegalArgumentException("O saldo inicial nao pode ser negativo");
        }
        this.saldo = saldo;
    }

    public String getNumeroConta() {
        String resposta = "";
        resposta = this.numeroConta;
        return resposta;
    }

    public String getTitular() {
        String resposta = "";
        resposta = this.titular;
        return resposta;
    }

    public float getSaldo() {
        float resposta = 0.0f;
        resposta = this.saldo;
        return resposta;
    }

    public String processarFechamentoMes() {
        String resposta = "";
        float saldoAtualizado = 0.0f;
        
        saldoAtualizado = this.calcularJuros();
        
        resposta = "Fechamento | Conta: " + this.numeroConta + " | Titular: " + this.titular + " | Saldo Atualizado: R$ " + saldoAtualizado;
        return resposta;
    }
}
