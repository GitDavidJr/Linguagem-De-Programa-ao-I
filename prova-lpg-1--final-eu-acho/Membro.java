public abstract class Membro {
    
    protected String nome;
    protected int codigo_acesso;
    protected int idade;
    protected Double salario;

    public Membro(String nome, int codigo_acesso, int idade, Double salario){
        this.nome = nome;
        this.codigo_acesso = codigo_acesso;
        this.idade = idade;
        this.salario = salario;
    }

    public abstract void liberarAcesso();

    public int getC(){
        return codigo_acesso;
    }

    public int getI(){
        return idade;
    }
}
