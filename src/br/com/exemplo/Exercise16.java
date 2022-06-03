package br.com.exemplo;

import java.util.Scanner;

public class Exercise16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o tamanho da área a ser pintada:");
        double areaSize = scanner.nextDouble();

        int inkCover = 3;
        int canCapacity = 18;
        int canPrice = 80;

        double liters = areaSize / inkCover;
        double quantityCans = Math.ceil(liters / canCapacity);

        double amount = quantityCans * canPrice;

        System.out.printf("Quantidade necessária de litros: %.2f%n", liters);
        System.out.printf("Quantidade necessária de latas: %.2f%n", quantityCans);
        System.out.printf("Valor total da compra:%.2f", amount);
    }
}
