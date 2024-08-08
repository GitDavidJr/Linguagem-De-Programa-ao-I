public class Banda {
    
    String nome;
    Musico m1, m2, m3;

    Banda(String nome, Musico m1,Musico m2,Musico m3){
    this.nome = nome;
    this.m1 = m1;
    this.m2 = m2;
    this.m3 = m3;
    }

    public void relatorio(){
        System.out.println("---------------");
        System.out.println("Banda");
        System.out.println(nome);
        System.out.println("---------------");
        System.out.println();

        System.out.println("Integrante 1:");
        m1.imprimir_Musico();
        System.out.println();

        System.out.println("Integrante 2:");
        m2.imprimir_Musico();
        System.out.println();
        
        System.out.println("Integrante 3:");
        m3.imprimir_Musico();
    }
}
