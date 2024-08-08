public class Musico {

    private Info info_pessoais;
    private String instrumento;
    private int experiencia;

    Musico(Info info_pessoais, String instrumento, int experiencia){
        this.info_pessoais = info_pessoais;
        this.instrumento = instrumento;
        this.experiencia = experiencia;
    }

    public void imprimir_Musico(){
        info_pessoais.imprimir_Info();
        System.out.println("Instrumento: " + instrumento);
        System.out.println("Experiencia com o instrumento de 0 a 10: " + experiencia);
    }
}
