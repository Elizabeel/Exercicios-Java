/*Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
mensagem explicativa*/

import java.util.Scanner;

public class EstruturaSequencial1 {
    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);

        int primeiroNumero;
        int segundoNumero;
        int soma;

        System.out.println("Digite o primeiro número inteiro");
        primeiroNumero = sc.nextInt();

        System.out.println("Digite o segundo número inteiro");
        segundoNumero = sc.nextInt();

        soma = primeiroNumero + segundoNumero;

        System.out.println("Soma dos valores = " + soma);

        sc.close();
    }
}
