public class Estagiario extends Funcionario{

    private int horasdeTrabalho;

    public Estagiario(String nome, double calculoSalario, int horasdeTrabalho){
        super(nome, calculoSalario);
        this.horasdeTrabalho = horasdeTrabalho;
    }
    @Override
    public double calcularSalario() {
        return calculoSalario * horasdeTrabalho;
    }

    @Override
    public void realizarTarefa() {
        System.out.println("O estagiário " + nome + " está realizando tarefas de suporte");
    }
}
