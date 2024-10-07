/*Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto
de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).*/

import java.util.Scanner;

public class EstruturaSequencial3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int valor1;
        int valor2;
        int valor3;
        int valor4;
        int diferenca;

        System.out.println("Digite um  inteiro: ");
        valor1 = sc.nextInt();
        System.out.println("Digite um segundo valor inteiro: ");
        valor2 = sc.nextInt();
        System.out.println("Digite um terceiro valor inteiro: ");
        valor3 = sc.nextInt();
        System.out.println("Digite um quarto valor inteiro: ");
        valor4 = sc.nextInt();

        diferenca = valor1 * valor2 - valor3 * valor4;

        System.out.println("Diferença = " + diferenca);

        sc.close();
    }
}
