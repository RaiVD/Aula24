package Exercicio1;

// Coloquei meu Scanner no Construtor

public class main {
    public static void main(String[] args) {
        Caixa caixa = new Caixa();

        System.out.println("Quantos lançamentos deseja fazer?");
        double entradaResposta = caixa.getLer();

        for( int i=0; i < entradaResposta; i++){
            System.out.println("Digite 1 para Débito e 2 para Crédito");
            double entradaResposta1 = caixa.getLer();

            if(entradaResposta1==1){
                System.out.println("Qual valor deseja sacar?");
                System.out.println("Saldo atual: " + caixa.caucularDebito());

            } else if (entradaResposta1==2) {
                System.out.println("Qual valor deseja depositar?");
                System.out.println("Saldo atual: " + caixa.caucularCredito());

            }else{
                System.out.println("Opção invalida");
            }
        }
    }
}
