package logica_de_programacao;

import java.util.Scanner;

public class EstruturaCondicional8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double salario;
        double imposto = 0.0;

        System.out.print("Digite o salário (com duas casas decimais): ");
        salario = sc.nextDouble();

        if (salario <= 2000.00) {
            imposto = 0.0;
        } else if (salario <= 3000.00) {
            imposto = (salario - 2000.00) * 0.08;
        } else if (salario <= 4500.00) {
            imposto = (1000.00 * 0.08) + (salario - 3000.00) * 0.18;
        } else {
            imposto = (1000.00 * 0.08) + (1500.00 * 0.18) + (salario - 4500.00) * 0.28;
        }

        if (imposto > 0) {
            System.out.printf("Imposto a pagar: R$ %.2f%n", imposto);
        } else {
            System.out.println("Isento");
        }

        sc.close();
    }
}

