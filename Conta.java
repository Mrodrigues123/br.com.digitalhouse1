public class Conta {

    private int numeroDaConta;
    private int saldo;
    private String titular;

    public Conta() {
    }

    public int getNumeroDaConta() {
        return numeroDaConta;
    }

    public void setNumeroDaConta(int numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void depositar(int valor){
        saldo += valor;
    }
    public void sacar(int valor){
        saldo -= valor;
    }
}




