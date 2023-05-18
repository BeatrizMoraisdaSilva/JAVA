public class Livro extends Produto{

    private String nomeLivro;
    private String nomeAutor;

    public Livro(String nome, double preco, String nomeLivro, String nomeAutor){
        super(nome, preco);
        this.nomeAutor = nomeAutor;
        this.nomeLivro = nomeLivro;
    }

    @Override
    public double calcularPreco() {
        return preco;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Livro: " + nome);
        System.out.println("Autor: " + nomeAutor);
        System.out.println("Ano de Publicação: " + nomeLivro);
        System.out.println("Preço: " + preco);
    }
}
