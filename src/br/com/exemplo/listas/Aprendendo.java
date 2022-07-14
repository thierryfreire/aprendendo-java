package br.com.exemplo.listas;

public class Aprendendo {
    public static void main(String[] args) {
        int[] numeros = {1, 48, 62, 66, 52};

        for(int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }
        for(int numero: numeros){
            System.out.println(numero);
        }
        int i = 0;
        while (i < numeros.length) {
            System.out.println(numeros[i]);
            i++;
        }
    }
}
