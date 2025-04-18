public class Aluno extends Pessoa{
    private String matricula;
    private String curso;
    private String nascimento;

    public Aluno(String nome, int idade, String cpf, String matricula, String curso, String nascimento){
        super(nome, cpf, idade);
        this.matricula = matricula;
        this.curso = curso;
        this.nascimento = nascimento;
    }

    public String getMatricula(){
        return matricula;
    }
    public String getCurso(){
        return curso;
    }
    public String getNascimento(){
        return nascimento;
    }

    public void serMatricula(String matricula){
        this.matricula = matricula;
    }
    public void setCurso(String curso){
        this.curso = curso;
    }
    public void setNascimento(String nascimento){
        this.nascimento = nascimento;
    }

    @Override
    public void exibirDados(){
        super.exibirDados();
        System.out.println("Matrícula: " + matricula);
        System.out.println("Curso: " + curso);
        System.out.println("Data de Nascimento: " + nascimento);
    }
}
