package logica_de_programacao;/*Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar*/

import java.util.Scanner;

public class EstruturaCondicional2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int numeroInteiro;

        System.out.print("Digite um número inteiro: ");
        numeroInteiro = sc.nextInt();

        if (numeroInteiro % 2 == 0) {
            System.out.println("O número " + numeroInteiro + " é par.");
        } else {
            System.out.println("O número " + numeroInteiro + " é ímpar.");
        }

        sc.close();
    }
}
