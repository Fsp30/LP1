package if_oo_20261_heranca;

public class ContaPoupanca extends ContaBancaria {
    
    private float taxaJuros;

    public ContaPoupanca(String numeroConta, String titular, float saldoInicial, float taxaJuros) {
        setNumeroConta(numeroConta);
        setTitular(titular);
        setSaldo(saldoInicial);
        setTaxaJuros(taxaJuros);
    }

    public void setTaxaJuros(float taxaJuros) {
        if (taxaJuros < 0.0f) {
            throw new IllegalArgumentException("A taxa de juros nao pode ser negativa");
        }
        this.taxaJuros = taxaJuros;
    }

    @Override
    public float depositar(float valor) {
        float resposta = 0.0f;
        
        if (valor <= 0.0f) {
            throw new IllegalArgumentException("O valor de deposito deve ser maior que zero");
        }
        
        this.saldo = this.saldo + valor;
        resposta = this.saldo;
        return resposta;
    }

    @Override
    public float sacar(float valor) {
        float resposta = 0.0f;
        
        if (valor <= 0.0f) {
            throw new IllegalArgumentException("O valor de saque deve ser maior que zero");
        }
        if (valor > this.saldo) {
            throw new IllegalArgumentException("Saldo insuficiente para saque");
        }
        
        this.saldo = this.saldo - valor;
        resposta = this.saldo;
        return resposta;
    }

    @Override
    public float calcularJuros() {
        float resposta = 0.0f;
        float rendimento = 0.0f;
        
        rendimento = this.saldo * this.taxaJuros;
        this.saldo = this.saldo + rendimento;
        resposta = this.saldo;
        
        return resposta;
    }
}
