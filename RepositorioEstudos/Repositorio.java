public class Repositorio {
    
    //as 2 variaveis privadas q a questão pede
    private int indice; //essa vai controlar a quantidade de itens inseridos
    private Agencia[] BD; // essa vai armazenar os itenas inseridos

    public Repositorio(){ //construtor para vc poder chamar esse objeto no main
        BD = new Agencia[10]; //10 é o quantidade maxima de Agencias q da para inserir
        indice = 0; // a variavel de controle de itens inseridos tem q começar em 0
    }

    public void inserir(Agencia agencia){ // metodo void pq não renorna nada quando chamado, e tem que passar uma agencia como parametro que sera a agencia inserida no Array BD

        boolean repetido = false; //variavel de controle para saber se a agencia ja foi inserida
        for(int i = 0; i < indice; i++){
        //esse é um "for" padrão q sempre vai ser usado para percorrer todos os itens de um array,dentro do for vc vai fazer uma operação que sera feita em todas as casas do Array do array para chamar cada item do array vc ira usar o indice "i" que ele começa em 0 e vai até a ultma casa do array

            if(agencia.getCnpj().equals(BD[i].getCnpj())){
            //compara o cnpj do Agencia passado como parametro com o a todas as agencias ja inseridas no repositorio/array = BD[i], esse BD[i] dentro do for sempre vai representar todos os itens ja inseridos, para você comparar 2 variaveis String/texto, nesse caso o CNPJ de cada uma das agencias, o "==" não funciona, voce tem q usar a função "equals" que ira retornar um valor booleano (verdadeiro ou falso) se as 2 String String forem iguais retorna verdadeiro se as 2 Strings forem diferentes falso

                repetido = true; 
                //se alguma das agencias inseridas tiverem o mesmo CNPJ nos atrbuiremos a variavel booleana de controle repetido a verdadeiro, indicando que ja existe uma agencia inserida comm esse cnpj
            }
        }

        if(!repetido){ // se não for repetido nos inseriremos a agencia no array/repositorio
            BD[indice] = agencia;//sempre que formos adicionar um item no repositorio usaremos o BD[indice] para inserimor, atribuindo a agencia passada a essa casa do array
            indice++;// apos inserir um item no repositorio/array temos sempre que aumentar o indice
        }
    }

    public Agencia maisAntiga(){ 
    //essa função precisa retornar a agencia mais antiga, logo trocamos o void do metodo anterior por Agencia para podermos usar o "return" como vc pode ver no final do codigo

        Agencia maisAntiga = BD[0]; 
        //iniciamos para ter controle da agencia mais antiga indicando que ela é a primeira para apos fazermos o comparativo com as outras e sempre atribuindo essa variavel a agencia mais velha do repositorio/array

        for(int i = 0; i <indice;i++){ //for padrão como explicado acima para percorrer todo o array/repositorio

            if(BD[i].getIdadeAbertura() > maisAntiga.getIdadeAbertura()){
            // comparo a idade de aberturado da variavel controle com todos as agencias inseridas no array/repositorio começando da primeira até a ultima

                maisAntiga = BD[i];
                // toda vez q a condição anterios for verdadeira tenho q atribuir a variavel que vimos q é mais velha a variavel de controle que indica a agencia mais antiga
            }
        }

        return maisAntiga; //retorno a agencia mais antiga, uma vez que declaramos na instanciação do metodo que o tipo de retorno era "Agencia"
    }
}
