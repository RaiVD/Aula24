package Exercicio4;

public class ContaCorrente {
    private int numeroConta;
    private String nomeCorrentista;
    private double saldoConta;

    public ContaCorrente(int numeroContaA, String nomeCorrentistaB, double saldoContaC) {
        this.numeroConta = numeroContaA;
        this.nomeCorrentista = nomeCorrentistaB;
        this.saldoConta = saldoContaC;
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


}
