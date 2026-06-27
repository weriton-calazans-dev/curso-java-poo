package application;

import entities.RetanguloCalculo;

import java.util.Locale;
import java.util.Scanner;

public class Retangulo {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a altura do retângulo: ");
        double altura = sc.nextInt();
        System.out.println();
        System.out.print("Digite a largura do retângulo: ");
        double largura = sc.nextInt();
        System.out.println();

        RetanguloCalculo retangulo = new RetanguloCalculo(altura, largura);
        System.out.println(retangulo);

        sc.close();
    }
}