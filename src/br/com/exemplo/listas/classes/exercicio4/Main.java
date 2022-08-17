package br.com.exemplo.listas.classes.exercicio4;

public class Main {
    public static void main(String[] args) {

        Pessoa p1 = new Pessoa("Rodrigo", 24, 74.5, 177);
        p1.envelhecer();
        p1.engordar(2);
        p1.emagrecer(0.5);
        System.out.println(p1.getIdade());
        System.out.println(p1.getAltura());
        System.out.println(p1.getPeso());

        Pessoa p2 = new Pessoa("Mayte", 0, 8.0, 62);
        p2.envelhecer();
        p2.engordar(1);
        System.out.println(p2.getIdade());
        System.out.println(p2.getAltura());
        System.out.println(p2.getPeso());
    }
}
