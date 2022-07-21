package br.com.exemplo.listas.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class    Exercicio4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        char[] consoantes = new char[10];
        int quantidadeConsoantes = 0;

        for (int i = 0;  i < 10; i++){
            char caractere = scanner.next().toLowerCase().charAt(0);
            if (caractere == 97 || caractere == 101 || caractere == 105 || caractere == 111 || caractere == 117){
                continue;
            }
            quantidadeConsoantes++;
            consoantes[i] = caractere;
        }

        for (char consoante : consoantes){
            if (consoante == '\u0000'){
                continue;
            }
            System.out.printf("%c\n",consoante);
        }

        System.out.print("Quantidade de consoantes:"+ quantidadeConsoantes);
    }
}
