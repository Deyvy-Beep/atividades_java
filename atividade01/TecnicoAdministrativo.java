public class TecnicoAdministrativo extends Pessoa{
    private String setor;
    private String cargo;

    public TecnicoAdministrativo(String nome, String cpf, int idade, String setor, String cargo){
        super(nome, cpf, idade);
        this.setor = setor;
        this.cargo = cargo;
    }

    public String getSetor(){
        return setor;
    }
    public String getCargo(){
        return cargo;
    }

    public void setSetor(String setor){
        this.setor = setor;
    }
    public void setCargo(String cargo){
        this.cargo = cargo;
    }

    @Override
    public void exibirDados(){
        super.exibirDados();
        System.out.println("Setor: " + setor);
        System.out.println("Cargo: " + cargo);
    }
}
