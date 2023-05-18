public abstract class Funcionario {

    protected String nome;
    protected double calculoSalario;

    public Funcionario(String nome,double calculoSalario){
        this.nome=nome;
        this.calculoSalario = calculoSalario;
    }
    public abstract double calcularSalario();
    public abstract void realizarTarefa();

}
