package application;

import entities.CadastroCliente;

import java.util.Scanner;

public class ExercicioBanco {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("---Bem-Vindo! Ao banco java.---");
        System.out.println("---Para fazer seu cadastro digite seu nome:---");
        String nomeCliente = sc.nextLine();

        System.out.println("---Digite o número da conta com 5 digitos:---");
        String numeroConta = sc.next();

        System.out.println("---Informe o valor de depósito incial. (opcional)---");
        String saldo = sc.next();

        CadastroCliente banco = new CadastroCliente(nomeCliente, numeroConta, saldo);
        System.out.println(banco);



        sc.close();
    }
}
