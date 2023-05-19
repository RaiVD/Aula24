package Exercicio1;
import java.util.Scanner;

// Coloquei meu Scanner no Construtor

public class Caixa {
    private double Saldo;
    private Scanner ler;

    public Caixa() {
        this.Saldo = 1000;
        this.ler = new Scanner(System.in);
    }
    public void setSaldo(double saldoConstrutor) {
        this.Saldo = saldoConstrutor;
    }
     public double getSaldo() {
        return Saldo;
    }
    public double getLer() {
        double entrada = ler.nextDouble();
        return entrada;
    }
    public double caucularCredito(){
        return Saldo + getLer();
    }
    public double caucularDebito(){
        return Saldo - getLer();
    }
}
