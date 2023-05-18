/* Crie uma classe "Conta" com os atributos "saldo" e "numero".
Crie uma classe "ContaCorrente" que herda de "Conta" e adiciona um
atributo "limite". Crie objetos das classes "Conta" e "ContaCorrente"
e atribua valores aos seus atributos.
 */

public class Main {
    public static void main(String[] args) {

        ContaCorrente cliente1 = new ContaCorrente(189,12938913,380);
        ContaCorrente cliente2 = new ContaCorrente(160,545656565,500);

        System.out.println("Saldo cliente 1 = " + cliente1.getSaldo());
        System.out.println("Numero conta cliente 1 = " + cliente1.getNumero());
        System.out.println("Limite cliente 1 = " + cliente1.getLimite());

        System.out.println("Saldo cliente 2 = " + cliente2.getSaldo());
        System.out.println("Numero Conta cliente 2 = " + cliente2.getNumero());
        System.out.println("Limite Conta cliente 2 = " + cliente2.getLimite());
    }
}