package Exercicio3;

// Coloquei meu Scanner no Construtor

public class main {
    public static void main(String[] args) {
        Pessoas pessoas = new Pessoas();

        System.out.println("Você quer saber sua altura e idade por quantos anos, a partir da sua idade atual?");
        double anos = pessoas.getLer();


        for(int i=0; i<anos ;i++){

            if(pessoas.getIdade()<=21){
                System.out.println("--------------------------------------------------------------");
                System.out.println(pessoas.getNome());
                System.out.println(pessoas.calcularIdade() + " anos");
                System.out.println(pessoas.calcularAltura() + " metros");
                System.out.println(pessoas.getPeso() + "Kg");

            }else {

                System.out.println("--------------------------------------------------------------");
                System.out.println(pessoas.getNome());
                System.out.println(pessoas.calcularIdade() + " anos");
                System.out.println(pessoas.getAltura() + " metros");
                System.out.println(pessoas.getPeso() + "Kg");

            }
        }


    }
}
