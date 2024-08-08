public class Repositorio {

    private Paciente[] pacientes;
    private int indice;

    public Repositorio() {
        pacientes = new Paciente[5];
        indice = 0;
    }

    public void inserir(Paciente c) {
        pacientes[indice] = c;
        indice++;
    }

    public void remover(Paciente c) {
        for (int i = 0; i < indice; i++) {
            if (pacientes[i] == c) {
                pacientes[i] = pacientes[indice - 1];
                pacientes[indice - 1] = null;
                indice--;
            }
        }
    }

    public void Relatorio() {
        for (int i = 0; i < indice; i++) {
            pacientes[i].Relatorio();
            System.out.println();
        }
    }

}
