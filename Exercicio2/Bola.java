package Exercicio2;

public class Bola {
    private double circunferencia;
    private double velocidade;
    private String cor;
    private String marca;
    private String materal;

    public Bola(double velocidadeConstrutor,double circunferenciaConstrutor, String corConstrutor,String marcaConstrutor, String materialConstrutor) {
        this.circunferencia = circunferenciaConstrutor;
        this.velocidade = velocidadeConstrutor;
        this.cor = corConstrutor;
        this.marca = marcaConstrutor;
        this.materal = materialConstrutor;
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
