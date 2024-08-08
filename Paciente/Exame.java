public class Exame {
    private String desc;
    private int code;
    private double value;
    private Data reali;

    public Exame(String desc, int code, double value, Data reali) {
        this.desc = desc;
        this.code = code;
        this.value = value;
        this.reali = reali;
    }

    public void relatorio() {
        System.out.println("Descrição: " + desc);
        System.out.println("Codigo: " + code);
        System.out.println("Valor: " + value);
        System.out.print("Realização: ");
        reali.imprimirData();
    }

}
