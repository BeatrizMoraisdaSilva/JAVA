public class Main {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Beatriz", 5000.0, "Vendas");
        gerente.realizarTarefa();
        System.out.println("Salário do gerente: " + gerente.calcularSalario());
        System.out.println("------------------------");
        Vendedor vendedor = new Vendedor("Lucas", 2000.0, 500.0);
        vendedor.realizarTarefa();
        System.out.println("Salário do vendedor: " + vendedor.calcularSalario());
        System.out.println("------------------------");
        Estagiario estagiario = new Estagiario("Pedro", 1000.0, 80);
        estagiario.realizarTarefa();
        System.out.println("Salário do estagiário: " + estagiario.calcularSalario());
    }
}
