package Exercicio5;

// Coloquei meu Scanner no Construtor

public class Carro {
    private int quantidadePortas;
    private String modelo, marca, chave;
    private double potencia;
    public Carro() {
        this.quantidadePortas = 4;
        this.modelo = "Civic";
        this.marca = "Honda";
        this.potencia = 2.0;
        this.chave = "chaves";
    }
    public int getQuantidadePortas() {
        return quantidadePortas;
    }
    public String getModelo() {
        return modelo;
    }
    public String getMarca() {
        return marca;
    }
    public double getPotencia() {
        return potencia;
    }
    public String getChave() {
        return chave;
    }









}
