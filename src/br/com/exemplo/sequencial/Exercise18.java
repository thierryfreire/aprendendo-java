package br.com.exemplo.sequencial;

import java.util.Scanner;

public class Exercise18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Qaul o tamanho do arquivo em MB que deseja fazer download:");
        double download = scanner.nextDouble();

        System.out.print("Qual a velocidade do seu link em MPBS:");
        double link = scanner.nextDouble();

        double time = download / (link / 8) / 60;

        System.out.printf("Para efetuar um downlaod %.2f MB e com a velocidade de %.2f Mbps , ira demora %.2f" +
                " minutos",download, link, time);
    }
}
