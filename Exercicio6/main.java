package Exercicio6;

public class main {
    public static void main(String[] args) {
        Quadrado quadrado = new Quadrado(11.5, 11.5);

        System.out.println("Lado A: " + quadrado.getLadoA());
        System.out.println("Lado B: " + quadrado.getLadoB());

        System.out.println("Área atual: " + quadrado.calcularArea());
        System.out.println("------------------------------------------------------");

        quadrado.setLadoA(27);
        quadrado.setLadoB(27);

        System.out.println("Novo valor do lado A: " + quadrado.getLadoA());
        System.out.println("Novo valor do lado B: " + quadrado.getLadoB());

        System.out.println("Nova área: " + quadrado.calcularArea());
        System.out.println("------------------------------------------------------");


    }
}
