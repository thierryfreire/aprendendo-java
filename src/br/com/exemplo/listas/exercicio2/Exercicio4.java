package br.com.exemplo.listas.exercicio2;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double metros = 0;

        System.out.print("Digite a quatidade de metros:");
        metros = scanner.nextDouble();

        double resultado = metros * 100;

        System.out.print("Os metros convertido para centimetros são:" + resultado +"cm");
    }
}
