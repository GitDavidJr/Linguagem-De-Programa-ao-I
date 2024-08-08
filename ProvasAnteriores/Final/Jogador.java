public class Jogador extends Membro implements Contrato {
    
    private int anos_carreira;

    public Jogador(String nome, int codigo_acesso, int idade, Double salario, int anos_carreira){
        super(nome, codigo_acesso, idade, salario);
        this.anos_carreira = anos_carreira;
    }

    public void liberarAcesso(){
        System.out.println("Acesso autorizado para jogador " + nome + " que possui " + codigo_acesso + " e tem " + anos_carreira + " anos de experiência em times profissionais");
    }

    public void bonificacao(Double valor){
        salario += valor;
    }

    public Double encerramento(){
        return salario * anos_carreira;
    }
}
