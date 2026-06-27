package application;

import entities.Cadastro;

import java.util.Locale;
import java.util.Scanner;

public class Banco {
    public static void main(String[] args){
        //configura o programa para aceitar (.) como separador de decimal (padrão americano).
        Locale.setDefault(Locale.US);
        //inicializar o Scanner para conseguir ler o que o usuário digita.
        Scanner sc = new Scanner(System.in);
        //declara a variável (cadastro) do tipo Cadastro.
        Cadastro cadastro;

        //solicita e lê o nome do cliente.
        System.out.print("Digite seu nome: ");
        //utilizar o (nextLine) para ler o nome completo.
        String nome = sc.nextLine();
        System.out.print("Digite o número da conta com 4 digito: ");
        String conta = sc.next();
        System.out.print("Deseja realizar o primeiro depósito? digite ( Sim/Não ): ");
        String validarPrimeiroDeposito = sc.next();
        //estrura de decisão (independete de maiúsculas/menúsculasl).
        if (validarPrimeiroDeposito.equalsIgnoreCase("sim")){
            System.out.print("Digite o valor para o seu depósito: R$ ");
            String saldo = sc.next();
            //cria o objeto chamando o construtor de 3 parâmetros
            cadastro = new Cadastro(nome, conta, saldo);
        } else {
            //cria o objeto chamando o construtor de 2 parâmetros
            cadastro = new Cadastro(nome, conta);
        }
        System.out.println();
        //imprime na tela os dados atuais do cadastro chamando o método toString() automaticamente
        System.out.println(cadastro);
        System.out.println();

        System.out.print("Qual o valor de depósito? R$ ");
        String deposito = sc.next();
        //executa o método de depósito que está dentro do objeto cadastro para somar o valor do saldo.
        cadastro.deposito(deposito);

        System.out.println(cadastro);
        System.out.println();

        System.out.print("Digite o valor para saque? R$ ");
        String saque = sc.next();
        //executa o método de saque que está dentro do objeto cadastro que deduz o valor + a taxa de R$ 5,00.
        cadastro.saque(saque);
        System.out.println();

        System.out.println(cadastro);
        //fexha o Scanner para liberar a memória
        sc.close();
    }
}
