package Exercicio1;

import javax.swing.*;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Caixa caixa = new Caixa(1000);

        Scanner entrada = new Scanner(System.in);
        System.out.println("Quantos lançamentos deseja fazer?");
        double entradaResposta = entrada.nextDouble();



        for( int i=0; i < entradaResposta; i++){
            System.out.println("Digite 1 para Débito e 2 para Crédito");
            entradaResposta = entrada.nextDouble();


            if(entradaResposta==1){
                System.out.println("Qual valor deseja sacar?");
                entradaResposta = entrada.nextDouble();


                caixa.setSaldo(caixa.getSaldo()-entradaResposta);
                System.out.println(caixa.getSaldo());

            } else if (entradaResposta==2) {
                System.out.println("Qual valor deseja depositar?");
                entradaResposta = entrada.nextDouble();

                caixa.setSaldo(caixa.getSaldo()+entradaResposta);
                System.out.println(caixa.getSaldo());
            }else{
                System.out.println("Opção invalida");
            }


        }
    }
}
