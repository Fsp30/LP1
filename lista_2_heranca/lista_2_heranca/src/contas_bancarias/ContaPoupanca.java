package lista_2_heranca.contas_bancarias;

public class ContaPoupanca extends ContaBancaria {
    private float taxaJurosMensal = 0.005f;

    public ContaPoupanca(String numero, String titular, float saldo) {
        super(numero, titular, saldo);
    }

    @Override
    public void depositar(float valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("É necessário depositar um valor superior a zero");
        }
        this.saldo += valor;
    }

    @Override
    public void sacar(float valor) {
        if (valor > this.saldo) {
            throw new IllegalArgumentException("Saldo insuficiente na poupança.");
        }
        this.saldo -= valor;
    }

    @Override
    public float calcularJuros() {
        return this.saldo * taxaJurosMensal;
    }
}