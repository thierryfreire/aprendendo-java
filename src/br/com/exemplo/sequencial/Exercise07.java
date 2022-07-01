package br.com.exemplo.sequencial;

import java.util.Scanner;

public class Exercise07 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o lado: ");
        double side = scanner.nextDouble();

        double squareArea = Math.pow(side, 2) ;

        System.out.printf("O dobro da área do quadrado é: %.2f ", squareArea * 2);
    }
}
