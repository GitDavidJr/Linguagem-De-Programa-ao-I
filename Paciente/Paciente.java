public class Paciente {

    private String nome;
    private int idade;
    private Endereco end;
    private Exame tipoExame;

    public Paciente(String nome, int idade, Endereco end, Exame tipoExame) {
        this.nome = nome;
        this.idade = idade;
        this.end = end;
        this.tipoExame = tipoExame;
    }

    public void Relatorio() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        end.imprimirEnd();
        tipoExame.relatorio();
    }

}