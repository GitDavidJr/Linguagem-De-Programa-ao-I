import java.util.Random;
import java.util.Scanner;

class Poupanca extends Conta{
    Random aleatorio = new Random();
    Scanner s = new Scanner(System.in);

    private Double juros;

    public Poupanca(int number, Double balance, Cliente holder){
        super(number, balance, holder);
        juros = 0.01;
    }

    public void setJuros(Double j){
        juros = j;
    }

    public void viradaM(){
        balance += balance * juros;
    }

    public void extract(){
        super.extract();
        System.out.println("Tipo da conta: Poupança");
        System.out.println("Rentabilidade: " + juros + "/mes");
    }

    
}