package logica_de_programacao;/*Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode
começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.*/

import java.util.Scanner;

public class EstruturaCondicional4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int horaInicial;
        int horaFinal;
        int duracao;

        System.out.print("Digite a hora inicial (0 a 24): ");
        horaInicial = sc.nextInt();

        System.out.print("Digite a hora final (0 a 24): ");
        horaFinal = sc.nextInt();

        if (horaFinal > horaInicial) {
            duracao = horaFinal - horaInicial;
        } else {
            duracao = (24 - horaInicial) + horaFinal;
        }

        System.out.println("Duração do jogo: " + duracao + " horas.");

        sc.close();
    }
}
