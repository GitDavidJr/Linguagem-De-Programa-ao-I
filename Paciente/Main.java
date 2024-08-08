public class Main {
    public static void main(String[] args) {
        Data d1 = new Data(10, "outubro", 2023);

        Endereco e1 = new Endereco("batuque", 291, 45023670);

        Exame x1 = new Exame("Prostata", 69, 420.00, d1);

        Paciente p1 = new Paciente("Pedro Silva de Andrade", 18, e1, x1);
        Paciente p2 = new Paciente("João Pedro", 19, e1, x1);
        Paciente p3 = new Paciente("Pacheco", 17, e1, x1);
        Paciente p4 = new Paciente("Vinissão", 27, e1, x1);
        Paciente p5 = new Paciente("Nicolas", 42, e1, x1);

        Repositorio pacientes = new Repositorio();

        System.out.println();

        pacientes.inserir(p1);
        pacientes.inserir(p2);
        pacientes.inserir(p3);
        pacientes.inserir(p4);
        pacientes.inserir(p5);

        pacientes.remover(p2);

        pacientes.Relatorio();
    }

}
