import java.util.Random;
import java.util.Scanner;

public class CreateA {
    Scanner s = new Scanner(System.in);
    Random aleatorio = new Random();

    public CreateA(){}

    public void AccountC(int indice, int number[], String nome[],String cpf[], Cliente cliente[], Repositorio BD, Corrente c[]){

        System.out.print("Informe o nome do cliente: ");
        String nomeT= s.nextLine();
        nome[indice] = nomeT;

        System.out.print("Informe o CPF do cliente: ");
        String cpfT = s.nextLine();
        cpf[indice] = cpfT;
        
        cliente[indice] = new Cliente(nome[indice], cpf[indice]);
        number[indice] = aleatorio.nextInt(8999) + 1001;
        
        c[indice] = new Corrente(number[indice], 0.0, cliente[indice]);
        BD.inserir(c[indice]);
        
        indice++;

        System.out.println();
        System.out.println("--------------------------------------");
        System.out.println("Conta Corrente registrada com sucesso.");
        System.out.println("--------------------------------------");
        System.out.println();

    }

    public void AccountP(int indice, int number[], String nome[],String cpf[], Cliente cliente[], Repositorio BD, Poupanca p[]){

        System.out.print("Informe o nome do cliente: ");
        String nomeT= s.nextLine();
        nome[indice] = nomeT;
    
        System.out.print("Informe o CPF do cliente: ");
        String cpfT = s.nextLine();
        cpf[indice] = cpfT;

        cliente[indice] = new Cliente(nome[indice], cpf[indice]);
        number[indice] = aleatorio.nextInt(8999) + 1001;
            
        p[indice] = new Poupanca(number[indice], 0.0, cliente[indice]);
        BD.inserir(p[indice]);
            
        indice++;

        System.out.println();
        System.out.println("--------------------------------------");
        System.out.println("Conta Poupança registrada com sucesso.");
        System.out.println("--------------------------------------");
        System.out.println();

    }

    public void delete(Repositorio BD, Poupanca p[], Corrente c[], Cliente cli[], int indice){
        
        int option;

        do{ 

            System.out.println("-------------------------------------");
            System.out.println("1. Poupança | 2. Corrente | 3. Voltar");
            System.out.println("-------------------------------------");
            System.out.print("Selecione: ");
            option = s.nextInt();
            System.out.println();
            System.out.print("Registro: ");
            int dell = s.nextInt()-1;
            
            if(option == 1){
                
                option = 3;
                System.out.println();
                System.out.println("-----------------------------------------------------");
                System.out.println("Conta de " + cli[dell].nome + " excluida com sucesso.");
                System.out.println("-----------------------------------------------------");
                BD.excluir(p[dell]);
                //delete cliente

                indice--;
            }

            else if(option == 2){

                option = 3;
                System.out.println();
                System.out.println("-----------------------------------------------------");
                System.out.println("Conta de " + cli[dell].nome + " excluida com sucesso.");
                System.out.println("-----------------------------------------------------");
                BD.excluir(c[dell]);
                //delete cliente
                
                indice--;
            }

            else System.out.println("Opção invalida");
            
        } while(option != 3);
            
    }

    
}
