package Exercicio4;

import Exercicio3.Pessoas;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        ContaCorrente contaCorrente = new ContaCorrente(345, "Raissa", 1000);

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o numero da conta: ");
        double entradaResposta3 = entrada.nextDouble();

        if(entradaResposta3==contaCorrente.getNumeroConta()){
            System.out.println("Digite o nome do correntista: ");
            String entradaResposta2 = entrada.next();
            System.out.println("--------------------------------------------------");
            System.out.println("Seja Bem-Vindo "+ entradaResposta2);
            System.out.println("--------------------------------------------------");
        }else {
            System.out.println("Conta Invalida");
        }

        System.out.println("Quantos lançamentos deseja fazer?");
        double entradaResposta1 = entrada.nextDouble();

        for( int i=0; i < entradaResposta1; i++){
            System.out.println("Digite 1 para saque e 2 para deposito");
            entradaResposta1 = entrada.nextDouble();


            if(entradaResposta1==1){
                System.out.println("Qual valor deseja sacar?");
                entradaResposta1 = entrada.nextDouble();

                contaCorrente.setSaldoConta(contaCorrente.getSaldoConta()-entradaResposta1);
                System.out.println("--------------------------------------------------");
                System.out.println("Saldo atual da Conta Corrente " + contaCorrente.getSaldoConta());

            } else if (entradaResposta1==2) {
                System.out.println("Qual valor deseja depositar?");
                entradaResposta1 = entrada.nextDouble();

                contaCorrente.setSaldoConta(contaCorrente.getSaldoConta()+entradaResposta1);
                System.out.println("Saldo atual da Conta Corrente " + contaCorrente.getSaldoConta());
            }else{
                System.out.println("Opção invalida");
            }


        }


    }
}