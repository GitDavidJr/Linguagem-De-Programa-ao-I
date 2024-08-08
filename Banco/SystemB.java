import java.util.Random;
import java.util.Scanner;

public class SystemB {
    Scanner s = new Scanner(System.in);
    Random aleatorio = new Random();

    public SystemB(){

    }

    public void menu(){

        System.out.println();
        System.out.println("Selecione uma opção:");
        System.out.println("---------------------------------");
        System.out.println("0. Sair");
        System.out.println("1. Registrar nova conta Poupança");
        System.out.println("2. Registrar nova conta Corrente");
        System.out.println("3. Relatorio");
        System.out.println("4. Excluir conta");
        System.out.println("5. Debitar");
        System.out.println("6. Creditar");
        System.out.println("7. Proximo mês");
        System.out.println("---------------------------------");
        System.out.println();
    }

    public void finish(){

        System.out.println("Encerrando o programa. Obrigado!");

    }

    public void optionI(){
        System.out.println("Opção invalida");
    }
}
