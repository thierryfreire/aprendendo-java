package br.com.exemplo;

import java.util.Scanner;

public class Exercise15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o quanto ganha por hora trabalhada:");
        double hourValue = scanner.nextDouble();

        System.out.print("Digite o número de horas trabalhadas:");
        double workerdHours = scanner.nextDouble();

        System.out.print("Digite horas extras trabalhadas:");
        double overtimeWorked = scanner.nextDouble();

        double overtime = overtimeWorked / 60;

        double grossSalary = ( workerdHours + overtime) * hourValue;

        double incometax = grossSalary * 11 / 100;
        double inss = grossSalary * 8 / 100;
        double syndecate = grossSalary * 5 / 100;
        double netSalary = grossSalary - incometax - inss - syndecate;

        System.out.printf("Salário Bruto :%.2f R$%n", grossSalary);
        System.out.printf("Ir :%.2f R$%n", incometax);
        System.out.printf("Inss :%.2f R$%n", inss);
        System.out.printf("Sindicato :%.2f R$%n", syndecate);
        System.out.printf("Salário Liquido :%.2f R$%n", netSalary);
        }
}
