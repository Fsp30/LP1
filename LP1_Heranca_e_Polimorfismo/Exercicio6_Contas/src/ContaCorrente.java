package if_oo_20261_heranca;

public class ContaCorrente extends ContaBancaria {
    
    private float taxaPorDeposito;
    private float taxaManutencaoMensal;

    public ContaCorrente(String numeroConta, String titular, float saldoInicial, float taxaPorDeposito, float taxaManutencaoMensal) {
        setNumeroConta(numeroConta);
        setTitular(titular);
        setSaldo(saldoInicial);
        setTaxaPorDeposito(taxaPorDeposito);
        setTaxaManutencaoMensal(taxaManutencaoMensal);
    }

    public void setTaxaPorDeposito(float taxaPorDeposito) {
        if (taxaPorDeposito < 0.0f) {
            throw new IllegalArgumentException("A taxa de deposito nao pode ser negativa");
        }
        this.taxaPorDeposito = taxaPorDeposito;
    }

    public void setTaxaManutencaoMensal(float taxaManutencaoMensal) {
        if (taxaManutencaoMensal < 0.0f) {
            throw new IllegalArgumentException("A taxa de manutencao nao pode ser negativa");
        }
        this.taxaManutencaoMensal = taxaManutencaoMensal;
    }

    @Override
    public float depositar(float valor) {
        float resposta = 0.0f;
        
        if (valor <= 0.0f) {
            throw new IllegalArgumentException("O valor de deposito deve ser maior que zero");
        }
        
        this.saldo = (this.saldo + valor) - this.taxaPorDeposito;
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
        
        this.saldo = this.saldo - this.taxaManutencaoMensal;
        resposta = this.saldo;
        return resposta;
    }
}
