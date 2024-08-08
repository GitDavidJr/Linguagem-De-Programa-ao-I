import java.util.Scanner;

class Cliente{
    Scanner s = new Scanner(System.in);

    String nome;
    private String cpf;

    public Cliente(String nome, String cpf){
        this.nome = nome;
        this.cpf = cpf;
    }

    public void printCliente(){ 
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
    }
}