package br.com.exemplo.sequencial;

import java.util.Scanner;

public class Exercise14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o peso total dos peixes:");
        double fishWeight = scanner.nextDouble();

        int limitWeight = 50;
        double excess = fishWeight - limitWeight;
        double finePerKilo = (fishWeight - limitWeight) * 4;

        if (fishWeight > limitWeight) {
            System.out.printf("Peso ultrapassou em %.2f kg e você terá que pagar multa de %.2f", excess, finePerKilo);
        } else {
            System.out.printf("O limite não foi ultrapassado");
        }
    }
}