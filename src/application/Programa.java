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

        System.out.println();

        double total = prod.valorTotalEmEstoque();

        System.out.printf("O produto %s%n",prod.nome);
        System.out.printf("Preço por unidade %.2f%n", prod.preco);
        System.out.printf("A quantidade em estoque é: %d%n", prod.quantidade);
        System.out.printf("O valor total em estoque é: %.2f%n",total);
        sc.close();
    }
}
