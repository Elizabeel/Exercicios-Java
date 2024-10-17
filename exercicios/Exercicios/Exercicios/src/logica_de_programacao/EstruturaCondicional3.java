package logica_de_programacao;/*Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao
Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados em
ordem crescente ou decrescente.*/

import java.util.Scanner;

public class EstruturaCondicional3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int valor1;
        int valor2;

        System.out.print("Digite o primeiro valor inteiro : ");
        valor1 = sc.nextInt();

        System.out.print("Digite o segundo valor inteiro : ");
        valor2 = sc.nextInt();

        if (valor1 % valor2 == 0 || valor2 % valor1 == 0) {
            System.out.println("São múltiplos.");
        } else {
            System.out.println("Não são múltiplos.");
        }

        sc.close();
    }
}
