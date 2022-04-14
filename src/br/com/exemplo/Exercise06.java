package br.com.exemplo;

import java.util.Scanner;

public class Exercise06 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o valor da raio : ");

        double radius = scanner.nextDouble();

        double area = 3.14159 * radius * radius;

        System.out.printf("O valor da área e : %.2f", area);
    }
}
