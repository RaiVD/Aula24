package Exercicio6;

public class Quadrado {
    private double LadoA;
    private double LadoB;

    public Quadrado( double LadoA1, double LadoB1) {
        this.LadoA = LadoA1;
        this.LadoB = LadoB1;
    }
    public void setLadoA(double LadoA1) {
        this.LadoA = LadoA1 ;
    }
    public void setLadoB(double LadoB1) {
        this.LadoB = LadoB1 ;
    }
    public double getLadoA() {
        return LadoA;
    } public double getLadoB() {
        return LadoB;
    }
    public double calcularArea() {
        return LadoA * LadoB;
    }

}
