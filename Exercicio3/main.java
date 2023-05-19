package Exercicio3;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Pessoas pessoas = new Pessoas("Raissa", 15, 62, 1.40);
        Scanner entrada = new Scanner(System.in);
        System.out.println("Você quer saber sua altura e idade por quantos anos, a partir da sua idade atual?");
        int anos = entrada.nextInt();


        for(int i=0; i<anos ;i++){

            if(pessoas.getIdade()<21){
                pessoas.setIdade(pessoas.getIdade()+1);
                pessoas.setAltura(pessoas.getAltura()+0.05);
                System.out.println("--------------------------------------------------------------");
                System.out.println(pessoas.getNome());
                System.out.println(pessoas.getIdade() + " anos");
                System.out.println(pessoas.getAltura() + " metros");
                System.out.println(pessoas.getPeso() + "Kg");

            }else {
                pessoas.setIdade(pessoas.getIdade()+1);
                System.out.println("--------------------------------------------------------------");
                System.out.println(pessoas.getNome());
                System.out.println(pessoas.getIdade() + " anos");
                System.out.println(pessoas.getAltura() + " metros");
                System.out.println(pessoas.getPeso() + "Kg");

            }
        }


    }
}
