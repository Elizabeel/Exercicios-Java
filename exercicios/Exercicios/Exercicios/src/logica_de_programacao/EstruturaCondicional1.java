package logica_de_programacao;/*Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.*/

import java.util.Scanner;

public class EstruturaCondicional1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int numeroInteiro;

        System.out.print("Digite um número inteiro: ");
        numeroInteiro = sc.nextInt();

        if (numeroInteiro < 0) {
            System.out.println("O número " + numeroInteiro + " é negativo.");
        } else {
            System.out.println("O número " + numeroInteiro + " não é negativo.");
        }

        sc.close();
    }
}
