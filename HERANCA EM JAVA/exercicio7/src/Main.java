//7. Crie uma classe "Produto" com os atributos "codigo" e
// "preco". Crie uma classe "ProdutoPerecivel" que herda de "Produto"
// adiciona um atributo "dataValidade". Crie objetos das classes "Produto"
// e "ProdutoPerecivel" e atribua valores aos seus atributos.
public class Main {
    public static void main(String[] args) {

        ProdutoPerecivel produto1 = new ProdutoPerecivel(124,9.99, "09/05/2023");
        ProdutoPerecivel produto2 = new ProdutoPerecivel(125,8.99, "15/05/2023");

        System.out.println("PRODUTO PERECÍVEL 1");
        System.out.println("Código do produto: " + produto1.getCodigo());
        System.out.println("Preço do produto: " + produto1.getPreco());
        System.out.println("Data de validade do produto : " + produto1.getDataValidade());

        System.out.println("PRODUTO PERECÍVEL 2");
        System.out.println("Código do produto: " + produto2.getCodigo());
        System.out.println("Preço do produto: " + produto2.getPreco());
        System.out.println("Data de validade do produto: " + produto2.getDataValidade());


    }
}