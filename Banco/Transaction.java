import java.util.Scanner;

public class Transaction {
    Scanner s = new Scanner(System.in);
 
    public Transaction(){}

    public void debit(Poupanca p[],Corrente c[], Repositorio BD, Cliente cli[]){

        int option;

        do{ 

            System.out.println();
            System.out.println("-------------------------------------");
            System.out.println("1. Poupança | 2. Corrente | 3. Voltar");
            System.out.println("-------------------------------------");
            System.out.print("Selecione: ");
            option = s.nextInt();
            System.out.println();
            
            if(option == 1){
                
                option = 3;
                System.out.print("Registro: ");
                int select = s.nextInt()-1;
                System.out.println();
                System.out.print("Valor: ");
                Double value = s.nextDouble();
                p[select].debit(value);
                System.out.println();
                System.out.println("-----------------------------------------------------------------------------------------------------");
                System.out.println(value + " reais debitado da conta " + p[select].number + " do titular " + cli[select].nome + " com sucesso");
                System.out.println("-----------------------------------------------------------------------------------------------------");
                
                
            }

            else if(option == 2){

                int i = 0;

                do{
                
                option = 3;
                System.out.println("----------------------");
                System.out.println("1. Debito | 2. Credito");
                System.out.println("----------------------");
                System.out.print("Selecione tipo de pagamento: ");
                int typeD = s.nextInt();
                System.out.println();
                
                if(typeD == 1){

                    System.out.print("Registro: ");
                    int select = s.nextInt()-1;
                    System.out.println();
                    System.out.print("Valor: ");
                    Double value = s.nextDouble();
                    c[select].debit(value);
                    System.out.println();
                    System.out.println("-----------------------------------------------------------------------------------------------------");
                    System.out.println(value + " reais debitado da conta " + c[select].number + " do titular " + cli[select].nome + " com sucesso");
                    System.out.println("-----------------------------------------------------------------------------------------------------");

                } else if(typeD == 2){

                    System.out.print("Registro: ");
                    int select = s.nextInt()-1;
                    System.out.println();
                    System.out.print("Valor: ");
                    String input = s.nextLine();
                    Double value = Double.parseDouble(input);
                    System.out.println();
                    c[select].debitC(value);
                    System.out.println("-----------------------------------------------------------------------------------------------------");
                    System.out.println(value + " reais debitado da conta " + c[select].number + " do titular " + cli[select].nome + " com sucesso");
                    System.out.println("-----------------------------------------------------------------------------------------------------");

                } else {

                    System.out.println("----------------------------");
                    System.out.println("!Tipo de pagamento invalido!");
                    System.out.println("----------------------------");

                }
                } while( i == 0);
            }

            else System.out.println("Opção invalida");
            
        } while(option != 3);

    }

    public void credit(Poupanca p[],Corrente c[], Repositorio BD, Cliente cli[]){

        int option;

        do{ 

            System.out.println("-------------------------------------");
            System.out.println("1. Poupança | 2. Corrente | 3. Voltar");
            System.out.println("-------------------------------------");
            System.out.print("Selecione: ");
            option = s.nextInt();
            System.out.println();
            
            if(option == 1){
                
                option = 3;
                System.out.print("Registro: ");
                int select = s.nextInt()-1;
                System.out.println();
                System.out.print("Valor: ");
                Double value = s.nextDouble();
                p[select].credit(value);
                System.out.println();
                System.out.println("-----------------------------------------------------------------------------------------------------");
                System.out.println(value + " reais depositado da conta " + p[select].number + " do titular " + cli[select] + " com sucesso");
                System.out.println("-----------------------------------------------------------------------------------------------------");
                
                
            }

            else if(option == 2){
                
                option = 3;
                System.out.print("Registro: ");
                int select = s.nextInt()-1;
                System.out.println();
                System.out.print("Valor: ");
                Double value = s.nextDouble();
                c[select].credit(value);
                System.out.println();
                System.out.println("-----------------------------------------------------------------------------------------------------");
                System.out.println(value + " reais depositado da conta " + p[select].number + " do titular " + cli[select] + " com sucesso");
                System.out.println("-----------------------------------------------------------------------------------------------------");
            }

            else System.out.println("Opção invalida");
            
        } while(option != 3);

    }
    
}
