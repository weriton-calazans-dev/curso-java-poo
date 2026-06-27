package application;

import entities.Aluno;

import java.util.Locale;
import java.util.Scanner;

public class NotaAluno {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o nome do aluno: ");
        String nome = sc.nextLine();
        System.out.print("Digite a primeira nota: ");
        double nota1 = sc.nextDouble();
        System.out.print("Digite a segunda  nota: ");
        double nota2 = sc.nextDouble();
        System.out.print("Digite a terceira nota: ");
        double nota3 = sc.nextDouble();

        Aluno aluno = new Aluno(nome,nota1,nota2,nota3);
        System.out.println();
        System.out.printf("O total da nota do aluno: %.2f%n" , aluno.somaNota());

        if(aluno.somaNota() >= 60.00){
            System.out.println("Aluno aprovado!");
        } else {
            System.out.println("Aluno reprovado!");
            System.out.printf("Falta %.2f  ponta para aprovação!",aluno.quantofalta());
        }
        sc.close();
    }
}