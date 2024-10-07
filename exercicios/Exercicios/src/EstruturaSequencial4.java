/*Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
decimais.*/

import java.util.Scanner;

public class EstruturaSequencial4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int numeroFuncionario;
        int horasTrabalhadas;
        double valorPorHora;
        double calculaSalario;

        System.out.println("Qual seria o seu número de funcionário? ");
        numeroFuncionario = sc.nextInt();

        System.out.println("Qual seria o número de horas trabalhadas? ");
        horasTrabalhadas = sc.nextInt();

        System.out.println("Qual seria o valor por hora trabalhados? ");
        valorPorHora = sc.nextDouble();

        calculaSalario = horasTrabalhadas * valorPorHora;

        System.out.printf("Número do Funcionario: %d%n", numeroFuncionario);

        System.out.printf("Salário: R$ %.2f%n", calculaSalario);

        sc.close();
    }
}
