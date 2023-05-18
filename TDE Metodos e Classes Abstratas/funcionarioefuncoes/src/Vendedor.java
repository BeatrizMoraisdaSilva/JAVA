public class Vendedor extends Funcionario{
    private double comissao;

    public Vendedor(String nome, double calculoSalario, double comissao) {
        super(nome, calculoSalario);
        this.comissao = comissao;
    }

    @Override
    public double calcularSalario() {
        return calculoSalario + comissao;
    }

    @Override
    public void realizarTarefa() {
        System.out.println("O vendedor " + nome + " está realizando vendas");
    }
}