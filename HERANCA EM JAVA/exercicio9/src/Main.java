//9. Crie uma classe "Pessoa" com os atributos "nome" e "endereco".
// Crie uma classe "Cliente" que herda de "Pessoa" e adiciona um atributo
// "numeroCartao". Crie objetos das classes "Pessoa" e "Cliente" e atribua
// valores aos seus atributos.
public class Main {
    public static void main(String[] args) {

        Cliente cliente1 = new Cliente("Carlos","Ginasio da Ulbra", 125434);
        Cliente cliente2 = new Cliente("Carol","Praia Grande", 326541);

        System.out.println("Dados Cliente 1");
        System.out.println("Nome do Cliente: " + cliente1.getNome());
        System.out.println("Nome do Cliente: " + cliente1.getEndereco());
        System.out.println("Nome do Cliente: " + cliente1.getNumeroCartao());

        System.out.println("Dados Cliente 2");
        System.out.println("Nome do Cliente: " + cliente2.getNome());
        System.out.println("Nome do Cliente: " + cliente2.getEndereco());
        System.out.println("Nome do Cliente: " + cliente2.getNumeroCartao());
    }
}