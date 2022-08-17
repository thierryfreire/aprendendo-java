package br.com.exemplo.listas.exercicios;

import java.util.Scanner;

public class Exercicio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma letra:");
        String letra = scanner.next();

        if (letra.equals("a") || letra.equals("e") || letra.equals("i") || letra.equals("o") || letra.equals("u")) {
            System.out.println("Vogal");
        } else {
            System.out.println("Consoante");
        }

    }
}
