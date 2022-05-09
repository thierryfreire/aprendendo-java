package br.com.exemplo;

import java.util.Scanner;

public class Exercise11 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número inteiro:");
        int number1 = scanner.nextInt();

        System.out.print("Digite o segundo número inteiro:");
        int number2 = scanner.nextInt();

        System.out.print("Digite o terceiro número real:");
        int realNumber = scanner.nextInt();

        double result1 = (number1 * 2) * number2 / 2;
        double result2 = number1 * 3 + realNumber;
        double result3 = realNumber * 3 * 3;

        System.out.printf("O produto do dobro do primeiro com metade do segundo:%.2f%n",result1 );
        System.out.printf("A soma do triplo do primeiro com o terceiro:%.2f%n",result2);
        System.out.printf("o terceiro elevado ao cubo:%.2f",result3);

    }
}
