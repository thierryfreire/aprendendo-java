package br.com.exemplo.classes.exercicio1;

public class Bola {

    private String color;
    private double ray;
    private String material;

    public Bola(String color, double ray, String material) {
        this.color = color;
        this.ray = ray;
        this.material = material;
    }

    public void showColor() {
        System.out.println(color);
    }

    public void chageColor(String color) {
        this.color = color;
    }

    public double getCircunferencia() {
        return ray * ray * Math.PI;
    }

}
