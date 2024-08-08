public class Repositorio {
    
    private Membro BD[];
    private int indice;

    public Repositorio(){
        BD = new Membro[5];
        indice = 0;
    }

    public void inserir(Membro m){
        
        int rep = 0;
        
        if(indice == 0){
            BD[indice] = m;
            indice++;
        } else {
            for(int i = 0; i < indice; i++){
                if(BD[i].getC() == m.getC()){
                    rep += 1;
                }
            }
            if(rep > 0){
                System.out.println("Membro já cadastrado");
            } else{
                BD[indice] = m;
                indice++;
            }
        }
    }

    public void remover(Membro m){
        for(int i = 0; i < indice; i++){
            if(m == BD[i]){
                BD[i] = BD[indice-1];
                BD[indice-1] = null;
                indice--;
            }
        }
    }

    public int maisVelho(){

        int maior = 0;

        for(int i = 0; i < indice; i++){
            if(maior < BD[i].getI()){
                maior = BD[i].getI();
            }
        }
        
        return maior;
    }
}

