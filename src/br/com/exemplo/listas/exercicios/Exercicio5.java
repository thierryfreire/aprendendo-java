package br.com.exemplo.listas.exercicios;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> numeros = new ArrayList<>();
        List<Integer> impares = new ArrayList<>();
        List<Integer> pares = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            int numero = scanner.nextInt();
            numeros.add(numero);
            if(numero % 2 == 0){
                pares.add(numero);
            } else {
                impares.add(numero);
            }
        }
        System.out.println("NUMEROS");
        for (int numero : numeros ) {
            System.out.println(numero);
        }
        System.out.println("IMPARES");
        for (int numero : impares) {
            System.out.println(numero);
        }
        System.out.println("PARES");
        for (int numero : pares){
            System.out.println(numero);
        }
    }
}
