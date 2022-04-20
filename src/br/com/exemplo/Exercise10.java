package br.com.exemplo;

import java.util.Scanner;

public class Exercise10 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe os graus celsius:");
        double dregeesCelsius = scanner.nextDouble();

        double dregeesfahrenheit = 9 * dregeesCelsius / 5 + 32;

        System.out.printf("Graus Celsius transformado em graus Fahrenheit é:%.2f", dregeesfahrenheit);
    }
}
