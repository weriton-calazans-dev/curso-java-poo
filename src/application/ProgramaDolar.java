package application;

import util.ConversorMoeda;

import java.util.Scanner;

public class ProgramaDolar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Qual o valor do dólar hoje? R$ ");
        double cotacao = sc.nextDouble();

        System.out.print("Quantos dólar você vai comprar? $ ");
        double quantia = sc.nextDouble();

        double resultado = ConversorMoeda.dolarParaReal(quantia, cotacao);

        System.out.printf("valor a ser pago em reais: R$ %.2f%n",resultado);

        sc.close();
    }
}
