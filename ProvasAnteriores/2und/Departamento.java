public class Departamento extends Gerente {

    private int qnt_departamentos;

    public Departamento(String nome, String cpf, Double salario, int CRM, int qnt_departamentos){
        super(nome, cpf, salario, CRM);
        this.qnt_departamentos = qnt_departamentos;
    }

    public void getBonificacao(){
        salario += salario * 0.11;
    }

    //A prova ta pronta aqui. Para testa o programa criarei metodos de impressão

    public void printF(){
        super.printF();
        System.out.println("Quantidade de departamentos: " + qnt_departamentos);
    }
    
}
