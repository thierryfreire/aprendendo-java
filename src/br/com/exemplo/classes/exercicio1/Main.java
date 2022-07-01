package br.com.exemplo.classes.exercicio1;

public class Main {
    public static void main(String[] args){

        Bola bolaAdidas = new Bola("azul", 6 ,"ferro");
        bolaAdidas.showColor();
        bolaAdidas.chageColor("vermelho");
        bolaAdidas.showColor();

        double circunferancia = bolaAdidas.getCircunferencia();
        System.out.println(circunferancia);
    }
}
