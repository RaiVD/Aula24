package Exercicio4;

// Coloquei meu Scanner no Construtor

public class main {
    public static void main(String[] args) {
        ContaCorrente contaCorrente = new ContaCorrente();

        System.out.println("--------------------------------------------------");
        System.out.println("Nome do correntista: "+ contaCorrente.getNome());
        System.out.println("Numero da conta: "+ contaCorrente.getNumeroConta());
        System.out.println("--------------------------------------------------");

        System.out.println("Quantos lançamentos deseja fazer?");
        double entrada1 = contaCorrente.getLer();

        for( int i=0; i < entrada1; i++){
            System.out.println("1 - Saque \t 2 - Deposito");
            double entrada2 = contaCorrente.getLer();

            if(entrada2==1){
                System.out.println("Qual valor deseja sacar?");
                System.out.println("Saldo atual da Conta Corrente " + contaCorrente.caucularDebito());
            } else if (entrada2==2){
                System.out.println("Qual valor deseja depositar?");
                System.out.println("Saldo atual da Conta Corrente " + contaCorrente.caucularCredito());
            }else{
                System.out.println("Opção invalida");
            }
        }
    }
}