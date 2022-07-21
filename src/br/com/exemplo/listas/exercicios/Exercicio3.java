package br.com.exemplo.listas.exercicios;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] notas = new int[4];

        System.out.print("Digite a primeira nota:");
        notas[0] = scanner.nextInt();

        System.out.print("Digite a segunda nota:");
        notas[1] = scanner.nextInt();

        System.out.print("Digite a terceira nota:");
        notas[2] = scanner.nextInt();

        System.out.print("Digite a quarta nota:");
        notas[3] = scanner.nextInt();

        int soma = 0;
        for (int nota : notas){
            System.out.println(nota);
            soma += nota;
        }
        double media = soma / 4.0;

        System.out.println("A media é:"+ media);
    }
}
