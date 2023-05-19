package Exercicio5;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Carro carro = new Carro(4, "Civic", "Honda", 2.0,"Chave");

        Scanner entrada = new Scanner(System.in);
        System.out.println("Marca do carro: "+carro.getMarca());
        System.out.println("Modelo do carro: "+carro.getModelo());
        System.out.println("Potência do carro: "+carro.getPotencia());
        System.out.println("Quantas portas: "+carro.getQuantidadePortas());
        System.out.println("-----------------------------------------------------------------------");

        System.out.println("Deseja ligar o carro?");
        System.out.println("Digite 1 para Sim e 2 para Não");
        double entradaResposta = entrada.nextDouble();

        for( int i=0; i < entradaResposta; i++) {

            if (entradaResposta == 1) {
                System.out.println("Conectar chave!");
                System.out.println(carro.getChave() + " Conectada");
                System.out.println("Carro ligado");

            } else if (entradaResposta == 2) {
                System.out.println("Carro desligado!");
            } else {
                System.out.println("Opção invalida");
            }
        }
    }
}
