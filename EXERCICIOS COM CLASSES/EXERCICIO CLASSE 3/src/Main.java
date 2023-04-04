/*
Crie uma classe chamada "ContaBancaria" que representará uma conta bancária. Esta classe deve ter:
Três atributos privados: "numeroConta" (String), "saldo" (double) e "titular" (Pessoa).
Métodos públicos para depositar (depositar), sacar (sacar) e consultar o saldo (getSaldo).
 */
public class Main {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();
        pessoa1.setNome("Beatriz");
        pessoa1.setIdade(26);
        pessoa1.setAltura(1.63);

        ContaBancaria conta1 = new ContaBancaria();
        conta1.setNumeroConta("326487-7");
        conta1.setTitular(pessoa1);
        conta1.depositar(1000);
        conta1.sacar(850);

        System.out.println("Titular: " + conta1.getTitular().getNome());
        System.out.println("Número da conta: " + conta1.getNumeroConta());
        System.out.println("Saldo: " + conta1.getSaldo());
    }
}
