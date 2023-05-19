package Exercicio2;

import Exercicio1.Caixa;

public class main {
    public static void main(String[] args) {
        Bola bola = new Bola(20, 64, "Rosa", "Nike", "Poliuretano");

        System.out.println("A bola tem " + bola.getCircunferencia() + " de Circunferência");
        System.out.println("A bola tem uma velocidade de " + bola.getVelocidade()+" km");
        System.out.println("A cor da bola é " + bola.getCor());
        System.out.println("A marca da bola é " + bola.getMarca());
        System.out.println("Um dos materiais da bola é " + bola.getMateral());

        bola.setCor("Azul");

        System.out.println("------------------------------------------------------------------");
        System.out.println("A nova cor da bola é " + bola.getCor());
    }
}
