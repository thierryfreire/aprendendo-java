package br.com.exemplo;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe valor em metros: ");
        int metros = scanner.nextInt();
        double resultado = metros * 100;

        System.out.printf("Valor em metros e equivalete a %.2f cm.", resultado);
    }
}
