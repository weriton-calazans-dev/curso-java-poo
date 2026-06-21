package application;

import entities.Produto;

import java.util.Scanner;

public class Programa {
   public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o nome do produto: ");
        String nome = sc.nextLine();

        System.out.print("Digite o preço do produto: R$ ");
        double preco = sc.nextDouble();

        System.out.print("Digite a quantidade de entrada: ");
        int quantidade = sc.nextInt();

        Produto prod = new Produto(nome, preco, quantidade);

        System.out.println(prod);
        System.out.println();

        System.out.print("Quantos produtos foran adicionados ao estoque: ");
        quantidade = sc.nextInt();
        prod.adicionarProduto(quantidade);
        System.out.println(prod);
        System.out.println();

        System.out.printf("Quantos %s foram vendidas: ",prod.nome);
        quantidade = sc.nextInt();
        prod.vendaDeProduto(quantidade);
        System.out.println(prod);
        System.out.println();

        sc.close();
    }
}
