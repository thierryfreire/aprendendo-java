package br.com.exemplo;

import java.util.Scanner;

public class Exercise04 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a nota 1: ");
        double note1 = scanner.nextDouble();

        System.out.print("Digite a nota 2: ");
        double note2 = scanner.nextDouble();

        System.out.print("Digite a nota 3: ");
        double note3 = scanner.nextDouble();

        System.out.print("Digite a nota 4: ");
        double note4 = scanner.nextDouble();

        double average =(note1 + note2 + note3 + note4) /2;

        System.out.printf("Sua media e de: %.2f", average);

    }
}
