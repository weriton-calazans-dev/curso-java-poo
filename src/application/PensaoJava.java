package application;

import entities.AlunoPensao;

import java.util.Locale;
import java.util.Scanner;

public class PensaoJava{
   public static void main(String[] args) {

    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
    AlunoPensao cadastro;
    AlunoPensao[] quartos = new AlunoPensao[10];

    System.out.println("---Olá quantos quartos vão querer?");
    int quantidadeQuarto = sc.nextInt();

        for (int i = 0; i < quantidadeQuarto; i++) {
            sc.nextLine();
            System.out.println("---Digite o nome do aluno:---");
            String nome = sc.nextLine();
            System.out.println("---Digite o gmail do aluno:---");
            String gmail = sc.next();
            System.out.println("---Qual o numero do quardo desejado de (0 a 9)");
            int quarto = sc.nextInt();
            quartos[quarto] = new AlunoPensao(nome,gmail,quarto);
        }
        for (int i = 0; i < quartos.length; i++) {
            if (quartos[i] != null) {
                System.out.println(quartos[i]);
            }

        }
       sc.close();
   }
}
