/*1. Crie uma classe "Pessoa" com os atributos "nome" e "idade".
Crie uma classe "Funcionario" que herda de "Pessoa" e adiciona um
atributo "cargo". Crie objetos das classes "Pessoa" e "Funcionario" e
atribua valores aos seus atributos.
*/
public class Main {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("João", 25);
        Funcionario funcionario1 = new Funcionario("Maria", 30, "Gerente de Projetos");

        System.out.println("Nome da Pessoa 1: " + pessoa1.getNome());
        System.out.println("Idade da Pessoa 1: " + pessoa1.getIdade());
        System.out.println("Nome do Funcionário 1: " + funcionario1.getNome());
        System.out.println("Idade do Funcionário 1: " + funcionario1.getIdade());
        System.out.println("Cargo do Funcionário 1: " + funcionario1.getCargo());
    }
}


