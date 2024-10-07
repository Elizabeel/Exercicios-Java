/*Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e
mostre:
a) a área do triângulo retângulo que tem A por base e C por altura.
b) a área do círculo de raio C. (pi = 3.14159)
c) a área do trapézio que tem A e B por bases e C por altura.
d) a área do quadrado que tem lado B.
e) a área do retângulo que tem lados A e B.*/

import java.util.Scanner;

public class EstruturaSequencial6 {
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);

        double pi = 3.14159;

        System.out.print("Digite o valor do raio: ");
        double raio = sc.nextDouble();

        double area = pi * Math.pow(raio, 2);

        System.out.printf("A=%.4f%n", area);

        sc.close();
    }
}
