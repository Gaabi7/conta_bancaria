public class contaBancaria {

    //Atributos privados
    private int numeroConta;
    private String titular;
    private double saldo;


    //Construtor - usado para criar uma nova conta
    public contaBancaria(int numeroConta, String titular, double saldoInicial) {
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    //Getter para numeroConta
    public int getNumeroConta() {
        return numeroConta;
    }

    //Setter para numeroConta
    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    //Getter para titular
    public String getTitular() {
        return titular;
    }

    //Setter para titular
    public void setTitular(String titular) {
        this.titular = titular;
    }

    //Getter para saldo (não tem setter!)
    public double getSaldo() {
        return saldo;
    }

    //Método para depósito
    public void depositar(double valor) {
        saldo += valor;
    }

    //Método para saque com validação
    public boolean sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            return true;
        } else {
            return false;
        }
    }
}
