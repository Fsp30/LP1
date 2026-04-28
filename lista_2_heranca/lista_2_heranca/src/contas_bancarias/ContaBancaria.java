package lista_2_heranca.contas_bancarias;

public abstract class ContaBancaria {
    private String titular;
    private String numeroConta;
    protected float saldo;

    public ContaBancaria(String titular, String numeroConta, float saldo){
        setTitular(titular);
        setNumeroConta(numeroConta);
        setSaldo(saldo);
    }

    public void setTitular(String titular) {
        if(titular == null || titular.trim().isEmpty()){
            throw new IllegalArgumentException("O titular deve ter um nome");
        }
        this.titular = titular;
    }

    public void setNumeroConta(String numeroConta) {
        if(numeroConta == null || numeroConta.trim().isEmpty()){
            throw new IllegalArgumentException("O numero da conta não pode ser vazio");
        }
        this.numeroConta = numeroConta;
    }

    public void setSaldo(float saldo) {
        if(saldo<0){
            throw new IllegalArgumentException("O saldo da conta não pode ser inferior a zero");
        }
        this.saldo = saldo;
    }

    public String getTitular() {
        return this.titular;
    }

    public String getNumeroConta() {
        return this.numeroConta;
    }

    public float getSaldo() {
        return this.saldo;
    }

    public abstract void depositar(float valor);
    public abstract void sacar(float valor);
    public abstract float calcularJuros();

    public void executarAtualizacaoMensal() {
        float ajuste = calcularJuros();
        setSaldo(this.saldo += ajuste);
    }



}
