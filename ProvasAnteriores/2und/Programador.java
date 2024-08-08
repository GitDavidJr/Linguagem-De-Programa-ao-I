public class Programador extends Funcionario {
    private String linguaguem_prog;

    public Programador(String nome, String cpf, Double salario, String linguaguem_prog){
        super(nome, cpf, salario);
        this.linguaguem_prog = linguaguem_prog;
    }

    public void getBonificacao(){
        salario = salario + salario * 0.15;
    }

        //A prova ta pronta aqui. Para testa o programa criarei metodos de impressão

        public void printF(){
            super.printF();
            System.out.println("Linguagem de programação: " + linguaguem_prog);
        }
}
