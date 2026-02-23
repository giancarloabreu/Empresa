public class Empresa {
    private String nome;
    private String[] funcionarios;

    public Empresa(){
        this.nome = "Empresa Desconhecida";
        this.funcionarios = new String[8];
    }

    public Empresa(String nome, String[] funcionarios) {
        this.nome = nome;
        this.funcionarios = funcionarios;
    }

    public void imprimirFuncionarios() {
        System.out.println("Empresa: " + nome);
        for (int i = 0; i < funcionarios.length; i++){
            if (funcionarios[i]==null){
                break;
            }
            System.out.println("Funcionario " + (i+1) + ": "+ funcionarios[i]);
        }
    }

    public int contarFuncionarios(){
        int contador = 0;
        for (int i = 0; i < funcionarios.length; i++){
            contador ++;
            if (funcionarios[i]==null){
                contador --;
            }
        }
        return contador;
    }


    public boolean verificarFuncionario(String nomeFuncionario) {
        for (int i = 0; i < funcionarios.length; i++){
            if (funcionarios[i] != null && funcionarios[i]==(nomeFuncionario)) {
                return true;
            }
        }
        return false;
    }

}