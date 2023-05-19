package Exercicio4;
import java.util.Scanner;

// Coloquei meu Scanner no Construtor

public class ContaCorrente {
    private int numeroConta;
    private String nomeCorrentista;
    private double saldoConta;
    private Scanner ler;

    public ContaCorrente() {
        this.numeroConta = 345;
        this.nomeCorrentista = "Raissa";
        this.saldoConta = 0;
        this.ler = new Scanner(System.in);
    }

    public void setSaldoConta(double saldoContaC) {

        this.saldoConta = saldoContaC;
    }
    public double getSaldoConta() {
         return saldoConta;
    }
    public int getNumeroConta() {
        return numeroConta;
    }
    public String getNome() {
        return nomeCorrentista;
    }
    public double getLer() {
        double entrada = ler.nextInt();
        return entrada;
    }
    public double caucularCredito(){
        return saldoConta + getLer();
    }
    public double caucularDebito(){
        return saldoConta - getLer();
    }

}
