package Exercicio5;

import javax.management.monitor.StringMonitor;

public class Carro {
    private int quantidadePortas;
    private String modelo;
    private String marca;
    private double potencia;
    private  String chave;

    public Carro(int quantidadePortas1, String modelo2, String marca3, double potencia4, String chaves) {
        this.quantidadePortas = quantidadePortas1;
        this.modelo = modelo2;
        this.marca = marca3;
        this.potencia = potencia4;
        this.chave = chaves;
    }

    public int getQuantidadePortas() {
        return quantidadePortas;
    }
    public String getModelo() {
        return modelo;
    }  public String getMarca() {
        return marca;
    }  public double getPotencia() {
        return potencia;
    }
    public String getChave() {
    return chave;
    }









}
