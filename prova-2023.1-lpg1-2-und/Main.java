public class Main {
    public static void main(String[] args) {

        Repositorio BD = new Repositorio();

        Gerente g1 = new Gerente("David", "12345678910", 2000.00, 1);
        Gerente g2 = new Gerente("Wiu","09876543211",3000.00,2);
        Projetos p1 = new Projetos("Leo", "56743829011", 100.00, 3, 0);
        Projetos p2 = new Projetos("Parreiras","11111111111",300.00,4,9);
        Departamento d1 = new Departamento("Vinicios", "22222222222", 1000.00, 5, 2);
        Departamento d2 = new Departamento("Pedro","33333333333", 900.00, 6, 1);
        Programador pr1 = new Programador("Pacheco", "77777777777", 1200.00, "java");
        Programador pr2 = new Programador("Nicolas", "888888888", 666.00,"PHP");

        BD.inserirFuncionario(g1);
        BD.inserirFuncionario(g2);
        BD.inserirFuncionario(p1);
        BD.inserirFuncionario(p2);
        BD.inserirFuncionario(d1);
        BD.inserirFuncionario(d2);
        BD.inserirFuncionario(pr1);
        BD.inserirFuncionario(pr2);

        //A prova ta pronta aqui. Para testa o programa criarei metodos de impressão

        BD.printAll();
        System.out.println();
        BD.bonificarAll();
        System.out.println("Bonificação geral");
        System.out.println();
        BD.printAll();

    }
}