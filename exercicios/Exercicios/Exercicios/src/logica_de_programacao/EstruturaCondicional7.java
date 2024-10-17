package logica_de_programacao;

import java.util.Locale;
import java.util.Scanner;

public class EstruturaCondicional7 {
    public static void main (String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner (System.in);

        double x;
        double y;

        System.out.print("Digite as coordenadas x e y (com uma casa decimal): ");
        x = sc.nextDouble();
        y = sc.nextDouble();

        // Verificando a posição do ponto
        if (x == 0 && y == 0) {
            System.out.println("Origem");
        } else if (x == 0) {
            System.out.println("Eixo Y");
        } else if (y == 0) {
            System.out.println("Eixo X");
        } else if (x > 0 && y > 0) {
            System.out.println("Quadrante I");
        } else if (x < 0 && y > 0) {
            System.out.println("Quadrante II");
        } else if (x < 0 && y < 0) {
            System.out.println("Quadrante III");
        } else if (x > 0 && y < 0) {
            System.out.println("Quadrante IV");
        }

        sc.close();
    }
}
