public class Projetos extends Gerente {

    private int qnt_projetos;

    public Projetos(String nome, String cpf, Double salario, int CRM, int qnt_projetos){
        super(nome, cpf, salario, CRM);
        this.qnt_projetos = qnt_projetos;
    }

    public void getBonificacao(){
        salario += salario * 0.11;
    }
    
    //A prova ta pronta aqui. Para testa o programa criarei metodos de impressão

    public void printF(){
        super.printF();
        System.out.println("Quantidade de projetos: " + qnt_projetos);
    }
}
