package application;

import entities.Produto;

import java.util.Scanner;

public class Programa {
   public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Produto prod = new Produto();

        System.out.print("Digite o nome do produto: ");
        prod.nome = sc.nextLine();

        System.out.print("Digite o preço do produto: R$ ");
        prod.preco = sc.nextDouble();

        System.out.print("Digite a quantidade de entrada: ");
        prod.quantidade = sc.nextInt();

        System.out.println(prod);
        System.out.println();

        System.out.print("Quantos produtos foran adicionados ao estoque: ");
        int quantidade = sc.nextInt();
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
