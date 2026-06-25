package entities;

public class CadastroCliente {
    private String nomeCliente;
    private int numeroConta;
    private double saldo;

    public CadastroCliente(String nomeCliente, int numeroConta) {
        this.nomeCliente = nomeCliente;
        this.numeroConta = numeroConta;
    }

    public CadastroCliente(String nomeCliente, int numeroConta, double depositoInicial) {
        this.nomeCliente = nomeCliente;
        this.numeroConta = numeroConta;
        depositoDinheiro(depositoInicial);
    }

    public String getNomeCliente() {
        return this.nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public int getNumeroConta() {
        return this.numeroConta;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void saqueDinheiro(double saque){
            this.saldo -= (5.0 + saque);
    }
    public void depositoDinheiro (double deposito){
        this.saldo += deposito;
    }

    @Override
    public String toString() {
        return
                "Cliente: " + nomeCliente +
                ", Conta: " + numeroConta +
                ", saldo: R$ " + String.format("%.2f",saldo);
    }
}
