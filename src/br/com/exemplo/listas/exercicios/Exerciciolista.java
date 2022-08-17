package br.com.exemplo.listas.exercicios;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exerciciolista {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<String> produtoVenda = new ArrayList<>();
        List<Double> valorProduto = new ArrayList<>();

        while (true){
            System.out.print("Produto:");
            String produto = scanner.next();
            if (produto.equals("finalizado")){
                break;

            }

            produtoVenda.add(produto);

            System.out.print("Valor:");
            double valores = scanner.nextDouble();
            valorProduto.add(valores);
        }
        System.out.println("NOTA FISCAL");
        for (int i = 0; i < produtoVenda.size(); i++){
            System.out.println(produtoVenda.get(i) + " " + valorProduto.get(i));
        }
        double somaProdutos = 0;
        for (double valor : valorProduto) {
            somaProdutos += valor;
        }


        System.out.println();
        System.out.println("Total:"+ somaProdutos);

    }
}
