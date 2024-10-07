/*Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A
seguir, calcule e mostre o valor da conta a pagar.*/

import java.util.Scanner;

public class EstruturaCondicional5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int codigo;
        int quantidade;
        double valor = 0.0;

        System.out.print("Qual seria o código do item? ");
        codigo = sc.nextInt();
        System.out.print("Qual seria a quantidade? ");
        quantidade = sc.nextInt();

        if (codigo == 1) {
            valor = 4.00;
        } else if (codigo == 2) {
            valor = 4.50;
        } else if (codigo == 3) {
            valor = 5.00;
        } else if (codigo == 4) {
            valor = 2.00;
        } else if (codigo == 5) {
            valor = 1.50;
        } else {
            System.out.println("Código do item inválido.");
            sc.close();
            return;
        }

        double total = valor * quantidade;

        System.out.printf("Total a pagar: R$ %.2f%n", total);

        sc.close();
    }
}
