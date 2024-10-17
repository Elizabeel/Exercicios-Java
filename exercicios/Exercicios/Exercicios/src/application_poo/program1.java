/*Fazer um programa para ler os valores da largura e altura
de um retângulo. Em seguida, mostrar na tela o valor de
sua área, perímetro e diagonal. Usar uma classe como
mostrado no projeto ao lado.*/

package application_poo;

import java.util.Locale;
import java.util.Scanner;
import entities_poo.product1;

public class program1 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        product1 rect = new product1();

        System.out.println("Insira a largura e a altura do retângulo:");
        rect.width = sc.nextDouble();
        rect.height = sc.nextDouble();

        System.out.printf("Area = %.2f%n", rect.area());
        System.out.printf("Perimetro = %.2f%n", rect.perimeter());
        System.out.printf("Diagonal = %.2f%n", rect.diagonal());
        sc.close();
    }
}
