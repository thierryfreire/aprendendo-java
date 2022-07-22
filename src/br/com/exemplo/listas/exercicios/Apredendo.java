package br.com.exemplo.listas.exercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Apredendo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Double> precoGasolina = new ArrayList<>();
        List<Double> litragem = new ArrayList<>();

        while (true){
            double preco = scanner.nextDouble();

            if (preco == 0){
                break;
            }
            precoGasolina.add(preco);
            double litros = scanner.nextDouble();
            litragem.add(litros);
        }

        double somaPrecoGasolina = 0;

        for (double preco : precoGasolina) {
            somaPrecoGasolina += preco;
        }

        double somaLitros = 0;

        for (double litros : litragem){
            somaLitros += litros;
        }

        double mediaPrecoGasolina = somaPrecoGasolina / precoGasolina.size();
        double mediaLitros = somaLitros / litragem.size();
        System.out.println(mediaPrecoGasolina);
        System.out.println(mediaLitros);

    }
}
