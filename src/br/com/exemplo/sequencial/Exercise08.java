package br.com.exemplo.sequencial;

import java.util.Scanner;

public class Exercise08 {
    public static void main(String[] args) {

        Scanner scanner =new Scanner(System.in);

        System.out.print("Informe quanto ganha por hora:");
        double hour = scanner.nextDouble();

        System.out.print("Informe a horas trabalhada no mês:");
        double workedHours = scanner.nextDouble();

        double result = hour * workedHours;

        System.out.printf("O salario referente ao mês é: %.2f", result);

    }
}
