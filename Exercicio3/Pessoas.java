package Exercicio3;

public class Pessoas {
    private String nome;
    private int idade;
    private double peso;
    private double altura;

    public Pessoas(String nomeConstrutor, int idadeConstrutor, double pesoConstrutor, double alturaConstrutor){
        this.nome = nomeConstrutor;
        this.idade = idadeConstrutor;
        this.peso = pesoConstrutor;
        this.altura = alturaConstrutor;
    }

    public void setIdade(int idadeConstrutor) {
        this.idade = idadeConstrutor;
    }
    public void setAltura(double alturaConstrutor) {
        this.altura = alturaConstrutor;
    }
    public String getNome() {
        return nome;
    }
    public int getIdade() {
        return idade;
    }
    public double getPeso() {
        return peso;
    }
    public double getAltura() {
        return altura;
    }




}
