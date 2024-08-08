public abstract class Funcionario {
    protected String nome;
    protected String cpf;
    protected Double salario;

    public Funcionario(String nome, String cpf, Double salario){
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
    }

    public abstract void getBonificacao();

    public boolean comparacao_cpf(Funcionario f){

        int cpf1 = Integer.parseInt(cpf);
        int cpf2 = Integer.parseInt(f.cpf);

        return cpf1 == cpf2;

    }

    //A prova ta pronta aqui. Para testa o programa criarei metodos de impressão

    public void printF(){
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Salário: " + salario);
    }
}
