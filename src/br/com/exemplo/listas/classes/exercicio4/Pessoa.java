package br.com.exemplo.listas.classes.exercicio4;

public class Pessoa {

    private String nome;
    private int idade;
    private double peso;
    private double altura;

    public Pessoa(String nome, int idade, double peso, double altura){
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.altura = altura;
    }

    public void envelhecer(){
        if(idade < 21){
            crescer(0.5);
        }
        idade++;
    }

    private void crescer(double centimetros){
        altura += centimetros;
    }

    public void engordar(double kilos){
        peso += kilos;
    }

    public void emagrecer(double kilos){
        peso -= kilos;
    }

    public int getIdade(){
        return idade;
    }

    public double getAltura(){
        return altura;
    }

    public double getPeso(){
        return peso;
    }
}
