public class ContaBancaria {
    private String titular;
    private String numeroConta;
    private float saldo;

    public ContaBancaria(String titular, String numeroConta) {
        setTitular(titular);
        setNumeroConta(numeroConta);
        this.saldo = 0.0f;
    }

    public void setTitular(String titular) {
        if (titular == null || titular.trim().isEmpty()) {
            throw new IllegalArgumentException("O titular não pode ser vazio");
        }
        this.titular = titular;
    }

    public void setNumeroConta(String numeroConta) {
        if (numeroConta == null || numeroConta.trim().isEmpty()) {
            throw new IllegalArgumentException("O numero da conta não pode ser vazio");
        }
        this.numeroConta = numeroConta;
    }

    public void setSaldo(float saldo) {
        if (saldo < 0.0f) {
            throw new IllegalArgumentException("O saldo inicial não pode ser negativo");
        }
        this.saldo = saldo;
    }

    public String getTitular() { 
        String resposta = "";
        resposta = this.titular;
        return resposta; 
    }
    
    public String getNumeroConta() { 
        String resposta = "";
        resposta = this.numeroConta;
        return resposta; 
    }
    
    public float getSaldo() { 
        float resposta = 0.0f;
        resposta = this.saldo;
        return resposta; 
    }

    public void depositar(float valor) {
        if (valor <= 0.0f) {
            throw new IllegalArgumentException("O valor de deposito deve ser maior que zero");
        } else {
            this.saldo = this.saldo + valor;
        }
    }

    public void sacar(float valor) {
        if (valor <= 0.0f) {
            throw new IllegalArgumentException("O valor de saque deve ser maior que zero");
        } else {
            if (valor > this.saldo) {
                throw new IllegalArgumentException("Saldo insuficiente para realizar o saque");
            } else {
                this.saldo = this.saldo - valor;
            }
        }
    }
}

