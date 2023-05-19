package Exercicio3;
import java.util.Scanner;

// Coloquei meu Scanner no Construtor

public class Pessoas {
    private String nome;
    private int idade;
    private double peso;
    private double altura;
    private Scanner ler;

    public Pessoas(){
        this.nome = "Raissa";
        this.idade = 15;
        this.peso = 62;
        this.altura = 1.40;
        this.ler = new Scanner(System.in);
    }

    public void setIdade(int idadeConstrutor) {
        this.idade = idadeConstrutor;
    }
    public void setAltura(double alturaConstrutor) {
        this.altura = alturaConstrutor;
    }
    public double getLer() {
        double entrada = ler.nextInt();
        return entrada;
    }
    public String getNome() {
        return nome;
    }
    public int getIdade() {
        return idade;
    }
    public double getPeso() {
        return peso;
    }
    public double getAltura() {
        return altura;
    }

    public double calcularIdade() {
        return idade ++;
    }
    public double calcularAltura() {
        return altura += 0.05;
    }




}
