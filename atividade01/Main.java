public class Main{
    public static void main(String[] args){
        Aluno aluno = new Aluno("Joao Cleber Jaiuson", 25, "123.456.789-10", "1241 1414 1412 1234", "ADS", "18/12/2000");

        Professor professor = new Professor("Fausto", "109.876.543-21", 47, "TUNGS4U54", "POO Java");

        TecnicoAdministrativo tecnico = new TecnicoAdministrativo("Joao Rocha Da Silva", "241.151.352-12", 31, "TI", "Suporte Tecnico");

        System.out.println("------ ALUNO ------");
        aluno.exibirDados();

        System.out.println("\n------ PROFESSOR ------");
        professor.exibirDados();

        System.out.println("\n------ TECNICO-ADMINISTRATIVO ------");
        tecnico.exibirDados();
        System.out.println("\n");
    }
}
