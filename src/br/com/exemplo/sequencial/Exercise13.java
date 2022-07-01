package br.com.exemplo.sequencial;

import java.util.Scanner;

public class Exercise13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite sua altura:");
        double height = scanner.nextDouble();

        double weightman = (72.7 * height) - 58;
        double wieghtwoman = (62.1 * height) - 44.7;

        System.out.printf("Peso ideal para homens: %.2f%n", weightman);
        System.out.printf("Peso ideal para mulheres: %.2f", wieghtwoman);
    }
}
