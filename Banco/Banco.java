import java.util.Scanner;

class Banco{
    public static void main(String[] args){

        //metodos java
        Scanner s = new Scanner(System.in);

        //metodos criados
        SystemB system = new SystemB();
        CreateA create = new CreateA();
        Transaction transfer = new Transaction();

        //variaveis
        String nome[] = new String[5];
        String cpf[] = new String[5];
        int number[] = new int[5];
        Cliente cliente[] = new Cliente[5];
        Poupanca p[] = new Poupanca[5];
        Corrente c[] = new Corrente[5];

        //variaveis de controle
        int indice = 0;
        int select = -1;

        //repositorio principal
        Repositorio BD = new Repositorio();
        
        //estrutura de repetição menu
        while (select != 0){

        system.menu();

        System.out.print("Selecione: ");
        select = s.nextInt();
            
        if(select == 0) system.finish();
        
        else if(select == 1) create.AccountP(indice, number, nome, cpf, cliente, BD, p);

        else if(select == 2) create.AccountC(indice, number, nome, cpf, cliente, BD, c);

        else if(select == 3) BD.relatorio();

        else if(select == 4) create.delete(BD, p, c, cliente, indice);

        else if(select == 5) transfer.debit(p, c, BD, cliente);

        else if(select == 6) transfer.credit(p, c, BD, cliente);

        else if(select == 7) BD.nextMes();

        else system.optionI();
    } 

       s.close();
    }
}