public class MainEx4 {
    public static void main(String[] args) {
        String[] funcs = new String[8];
        funcs[0] = "Joao Carlos";
        funcs[1] = "Jose Carlos";
        funcs[2] = "Mario Carlos";
        funcs[3] = "Ana Carla";
        funcs[4] = "Maria Carla";
        funcs[5] = "Joana Carla";

        Empresa emp = new Empresa ("Heidi Log", funcs);

        emp.imprimirFuncionarios();
        System.out.println("Cadastrados: " + emp.contarFuncionarios());
        System.out.println("Tem Maria Carla? " + emp.verificarFuncionario("Maria Carla"));
        System.out.println("Tem Dona Clara? " + emp.verificarFuncionario("Dona Clara"));
    }
}