package application;

import entities.CadastroCliente;

import java.util.Scanner;

public class ExercicioBanco {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CadastroCliente banco;

        System.out.println("---Bem-Vindo! Ao banco java.---");
        System.out.println("---Para fazer seu cadastro digite seu nome:---");
        String nomeCliente = sc.nextLine();

        System.out.println("---Digite o número da conta com 5 digitos:---");
        int numeroConta = sc.nextInt();

        System.out.println("---Deseja depósita algum valor? S/N:---");
        char deposita = sc.next().charAt(0);
        if (deposita == 'S' || deposita == 's'){

            System.out.println("---Informe o valor de depósito incial.---");
            double saldo = sc.nextDouble();

             banco = new CadastroCliente(nomeCliente, numeroConta, saldo);
            System.out.println(banco);
        } else {
            banco = new CadastroCliente(nomeCliente,numeroConta);
            System.out.println(banco);
        }
        banco.getNomeCliente();
        System.out.println();
        System.out.println("---Para fazer depósito de qual valor: R$---");
        double deposito = sc.nextDouble();
        banco.depositoDinheiro(deposito);
        System.out.println(banco);

        System.out.println();
        System.out.println("---Desejaria sacar quanto: R$---");
        double saque = sc.nextDouble();
        banco.saqueDinheiro(saque);
        System.out.println(banco);


        sc.close();
    }
}
