/*Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.*/

import java.util.Scanner;

public class EstruturaSequencial5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int codigoPeca1;
        int numeroPeca1;
        double valorPeca1;
        int codigoPeca2;
        int numeroPeca2;
        double valorPeca2;
        double calcular;

        System.out.println("Qual seria o código da Peça 1? ");
        codigoPeca1 = sc.nextInt();

        System.out.println("Qual seria o número da peça 1? ");
        numeroPeca1 = sc.nextInt();

        System.out.println("Qual seria o valor unitário da peça 1? ");
        valorPeca1 = sc.nextDouble();

        System.out.println("Qual seria o código da Peça 2? ");
        codigoPeca2 = sc.nextInt();

        System.out.println("Qual seria o número da peça 2? ");
        numeroPeca2 = sc.nextInt();

        System.out.println("Qual seria o valor unitário da peça 2? ");
        valorPeca2 = sc.nextDouble();

        calcular = (numeroPeca1 * valorPeca1) + (numeroPeca2 * valorPeca2);

        System.out.printf("Valor das peças a ser pago: R$ %.2f%n", calcular);

        sc.close();
    }
}
