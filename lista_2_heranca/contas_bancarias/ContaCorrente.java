package lista_2_heranca.contas_bancarias;
import lista_2_heranca.contas_bancarias.ContaBancaria;

public class ContaCorrente extends ContaBancaria {
    private float taxaManutencaoDeposito = 0.50f;
    private float taxaMensalFixa = 20.00f;

    public ContaCorrente(String numero, String titular, float saldo) {
        super(numero, titular, saldo);
    }

    @Override
    public void depositar(float valor) {
        if (valor <= taxaManutencaoDeposito) {
            throw new IllegalArgumentException("Valor insuficiente para cobrir a taxa de depósito.");
        }
        this.saldo += (valor - taxaManutencaoDeposito);
    }

    @Override
    public void sacar(float valor) {
        if (valor > this.saldo) {
            throw new IllegalArgumentException("Saldo insuficiente para saque.");
        }
        this.saldo -= valor;
    }

    @Override
    public float calcularJuros() {
        return -taxaMensalFixa;
    }
}