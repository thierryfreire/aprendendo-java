package br.com.exemplo.sequencial;

import java.util.Scanner;

public class Exercise12 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite sua altura:");
        double height = scanner.nextDouble();

        double weight = (72.7 * height) - 58;

        System.out.printf("Seu peso ideal é: %.2f kg",weight);
    }
}
