package Exercicio2;

public class Bola {
    private double circunferencia;
    private double velocidade;
    private String cor;
    private String marca;
    private String materal;

    public Bola() {
        this.circunferencia = 20;
        this.velocidade = 60;
        this.cor = "Rosa";
        this.marca = "Nike";
        this.materal = "Poliuretano";
    }
    public void setCor(String corConstrutor) {
        this.cor = corConstrutor;
    }
    public String getCor() {
        return cor;
    }
    public double getVelocidade() {
        return velocidade;
    }
    public double getCircunferencia() {
        return circunferencia;
    }
    public String getMarca() {
        return marca;
    }
    public String getMateral() {
        return materal;
    }



}
