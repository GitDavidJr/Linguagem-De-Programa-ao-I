public class Repositorio {

    private Funcionario BD[];
    private int indice;

    public Repositorio(){
        BD = new Funcionario[8];
        indice = 0;
    }

    public void inserirFuncionario(Funcionario f){
        
         // se for 0 não o cpf ainda não foi inserido se for 1 ja foi inserido
        
        boolean rep_cpf = false;

        if(indice > 0){
            BD[indice] = f;
            indice++;
        } else{
            for(int i = 0; i<indice; i++ ){
                rep_cpf = rep_cpf || BD[i].comparacao_cpf(f);
            }
            if(rep_cpf){
                System.out.println("Funcionario já cadastrado");
            } else{

                BD[indice] = f;
                indice++;
            }
        }
        
    }
    public void excluirFuncionario(Funcionario f){
        for(int i = 0; i < indice; i++){
            if(f == BD[i]){
                BD[i] = BD[indice - 1];
                BD[indice - 1] = null;
                indice--;
            }
        }
    }

    public void bonificarAll(){
        for(int i = 0; i < indice; i++){
            BD[i].getBonificacao();
        }
    }

    //A prova ta pronta aqui. Para testa o programa criarei metodos de impressão

    public void printAll(){
        
        System.out.println("Funcionarios:");

        for(int i = 0; i < indice; i++){
            System.out.println();
            BD[i].printF();
        }
    }
    
}
