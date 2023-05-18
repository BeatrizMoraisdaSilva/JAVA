public class Roupa extends Produto{
    private String tamanho;
    private String cor;

    public Roupa(String nome, double preco, String tamanho, String cor) {
        super(nome, preco);
        this.tamanho = tamanho;
        this.cor = cor;
    }

    @Override
    public double calcularPreco() {
        return preco;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Roupa: " + nome);
        System.out.println("Tamanho: " + tamanho);
        System.out.println("Cor: " + cor);
        System.out.println("Preço: " + preco);
    }
}