package br.com.exemplo;

import java.util.Scanner;

public class Exercise05 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe valor em metros: ");
        int meters = scanner.nextInt();
        double result = meters * 100;

        System.out.printf("Valor em metros e equivalete a %.2f cm.", result);
    }
}
