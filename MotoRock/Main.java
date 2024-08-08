public class Main {

    public static void main(String[] args) {

        Info DavidI1 = new Info("DavidV", 18, 'M');
        Musico DavidM1 = new Musico(DavidI1, "Violão", 7);

        Info DavidI2 = new Info("DavidB", 18, 'M');
        Musico DavidM2 = new Musico(DavidI2, "Bateria", 5);

        Info DavidI3 = new Info("DavidF", 18, 'M');
        Musico DavidM3 = new Musico(DavidI3, "Flauta", 2);

        Banda osDavids = new Banda("Os Davids", DavidM1, DavidM2, DavidM3);

        osDavids.relatorio();
    }
}