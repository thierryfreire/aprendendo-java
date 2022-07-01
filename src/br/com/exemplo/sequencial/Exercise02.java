package br.com.exemplo.sequencial;

import java.util.Scanner;

public class Exercise02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Me informe um número: ");
        int number = scanner.nextInt();

        System.out.printf("O número informado foi: %d", number);
    }
}
