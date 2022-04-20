package br.com.exemplo;

import java.util.Scanner;

public class Exercise09 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o graus fahrenheit:");
        double dregeesFahrenheit = scanner.nextDouble();

        double dregeesCelsius = 5 * ((dregeesFahrenheit - 32) / 9);

        System.out.printf("Os graus fahrenheit trasnfomado em graus celsius é:%.2f", dregeesCelsius);
    }
}
