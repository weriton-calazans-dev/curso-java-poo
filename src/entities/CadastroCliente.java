package entities;

public class CadastroCliente {
    private String nomeCliente;
    private String numeroConta;
    private String saldo;


    public CadastroCliente(String nomeCliente, String numeroConta, String saldo){
        if (nomeCliente.matches("^[a-zA-z ]+$")){
            if (numeroConta.strip().matches("^[0-9]{5}+$")){
                System.out.printf("Nome cadastrado com sucesso.");
                this.nomeCliente = nomeCliente;
                this.numeroConta = numeroConta;
                if (saldo.matches("^[0-9]*$")){
                    this.saldo = saldo;
                }
            } else {
                System.out.println("Conta inválida!");
            }
        } else{
            System.out.println("Nome inválido!");
        }

    }

    public String toString(){
        return  " Nome: " + nomeCliente +
                " ,Conta: " + numeroConta +
                " ,Saldo: " + saldo;
    }

}
