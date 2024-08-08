public class Data {

    private int mes;
    private int ano;
    
    public Data(int mes, int ano){
        this.mes = mes;
        this.ano = ano;
    }

    public void printData(){
        System.out.println(mes + "/" + ano);
    }
}
