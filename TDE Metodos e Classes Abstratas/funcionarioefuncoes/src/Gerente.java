public class Gerente extends Funcionario {
    private String departamento;

    public Gerente(String nome, double calculoSalario, String departamento) {
        super(nome, calculoSalario);
        this.departamento = departamento;
    }

    @Override
    public double calcularSalario() {
        return calculoSalario;
    }

    @Override
    public void realizarTarefa() {
        System.out.println("O gerente " + nome + " está coordenando o departamento " + departamento);
    }
}