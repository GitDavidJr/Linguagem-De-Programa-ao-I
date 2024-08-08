public class Repositorio {

    private Conta contas[];
    private int indice;

    public Repositorio() {
        contas = new Conta[5];
        indice = 0;
    }
    
    public void inserir(Conta c){
        contas[indice] = c;
        indice++;
    }

    public void excluir(Conta c){
        for(int i = 0; i < indice; i++){
            if(c == contas[i]){
                contas[i] = contas[indice - 1];
                contas[indice - 1] = null; 
                indice--;
            }
        }
    }

    public void nextMes(){
        for(int i = 0; i < indice; i++){
            contas[i].viradaM();
        }
    }

    public void relatorio(){

        if(indice != 0){
        for(int i = 0; i < indice; i++){
            System.out.println();
            System.out.println("--------------------------------------");
            contas[i].extract();
            System.out.println("Registro: " + (i + 1));
            System.out.println("--------------------------------------");
            System.out.println();
        }
    } else{
        System.out.println();
        System.out.println("!Nenhuma conta registrada!");
    }
}
}
