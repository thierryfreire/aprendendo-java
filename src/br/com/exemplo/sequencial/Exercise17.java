package br.com.exemplo.sequencial;

import java.util.Scanner;

public class Exercise17 {
    public static void main(String[] args) {
        final double GALLON_LITERS = 3.6;
        final double GALLON_PRICE = 25.0;
        final double CAN_LITERS = 18.0;
        final double CAN_PRICE = 80.0;
        final double COVER_BY_LITERS = 6;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos m² deseja pintar:");
        double area = scanner.nextDouble();

        double litersNeeded = area / COVER_BY_LITERS;

        double litersInCans = Math.ceil(litersNeeded / CAN_LITERS);
        double valueOfCans = litersInCans * CAN_PRICE;

        double gallon = Math.ceil(litersNeeded / GALLON_LITERS);
        double gallonValue = gallon * GALLON_PRICE;

        litersNeeded *= 1.1;

        double mixCans = litersNeeded > 14 ? Math.floor(litersNeeded / CAN_LITERS) : 0;
        double mixGallon = Math.ceil(litersNeeded % CAN_LITERS / GALLON_LITERS);
        double total = (mixCans * CAN_PRICE) + (mixGallon * GALLON_PRICE);

        System.out.printf("Se for comprar apenas latas de 18 litros irá precisar de %.2f de lata(s) e irá custar R$ %.2f%n ", litersInCans, valueOfCans);
        System.out.printf("Se for comprar apenas galões de 3,6 litros irá precisar de %.2f de galão(ões) e irá custar R$ %.2f%n", gallon, gallonValue);
        System.out.printf("Se deseja faz um mix entre lata(s) e galão(ões) para ter mais precisão será necessario de %.2f de lata(s) e %.2f " +
                "de galão(ões) e o valor desse mix será de R$ %.2f", mixCans, mixGallon, total);
    }
}
