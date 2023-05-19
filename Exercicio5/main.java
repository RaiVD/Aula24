package Exercicio5;
import java.util.Scanner;

// Coloquei meu Scanner no Construtor

public class main {
    public static void main(String[] args) {
        Carro carro = new Carro();

        Scanner entrada = new Scanner(System.in);
        System.out.println("Marca do carro: " + carro.getMarca());
        System.out.println("Modelo do carro: " + carro.getModelo());
        System.out.println("Potência do carro: " + carro.getPotencia());
        System.out.println("Quantas portas: " + carro.getQuantidadePortas());
        System.out.println("-----------------------------------------------------------------------");

        System.out.println("Deseja ligar o carro?");
        System.out.println("1 - Sim \t 2 - Não");
        double entradaResposta = entrada.nextDouble();

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
