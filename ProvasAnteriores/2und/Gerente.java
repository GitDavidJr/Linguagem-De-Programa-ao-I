public class Gerente extends Funcionario {

    protected int CRM;

    public Gerente(String nome, String cpf, Double salario, int CRM){
        super(nome, cpf, salario);
        this.CRM = CRM;
    }

    public void getBonificacao(){
        salario += salario * 0.09;
    }

    //A prova ta pronta aqui. Para testa o programa criarei metodos de impressão

    public void printF(){
        super.printF();
        System.out.println("CRM: " + CRM);
    }
}
