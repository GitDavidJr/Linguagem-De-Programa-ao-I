public class Equipe_tecnica extends Membro {
    
    private int exp_mercado;
    private Data entradaEquipe;

    public Equipe_tecnica(String nome, int codigo_acesso, int idade, Double salario, int exp_mercado, Data entradaEquipe){
        super(nome, codigo_acesso, idade, salario);
        this.exp_mercado = exp_mercado;
        this.entradaEquipe = entradaEquipe;
    }

    public void liberarAcesso(){
        System.out.println("Acesso autorizado para o membro da equipe tecnica " + nome + " que possui " + codigo_acesso + " e tem " + exp_mercado + " anos de experiência no mercado");
    }
}
