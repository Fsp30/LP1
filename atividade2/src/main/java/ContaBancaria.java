public class ContaBancaria {
    private String titular;
    private int numeroConta;
    private float saldo;

    public void setTitular(String titular) {
        if(titular.trim().isEmpty()){
            throw new IllegalArgumentException("O titular deve ter um nome");
        }
        this.titular = titular;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public float getSaldo() {
        return saldo;
    }

    public void depositar(float valor){
        if(valor <= 0){
            throw new IllegalArgumentException("É necessário depositar um valor maior que zero");
        }
        this.saldo += valor;
    }

    public void sacar(float valor){
        if(valor <= 0){
            throw new IllegalArgumentException("É necessário sacar um valor maior que zero");
        }
        if(valor > this.saldo){
            throw new IllegalArgumentException("Para efetuar saque o valor da conta deve permancer positivo ou igual a zero, após o saque");
        }

        this.saldo -= valor;
    }


}