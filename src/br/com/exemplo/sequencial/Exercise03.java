package br.com.exemplo.sequencial;

import java.util.Scanner;

public class Exercise03 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o primeiro número: ");
        int number1 = scanner.nextInt();

        System.out.print("Informe o segundo número: ");
        int number2 = scanner.nextInt();

        int sum = number1 + number2;

        System.out.printf("A soma entre %d e %d e igual a: %d", number1, number2, sum);
    }
}
