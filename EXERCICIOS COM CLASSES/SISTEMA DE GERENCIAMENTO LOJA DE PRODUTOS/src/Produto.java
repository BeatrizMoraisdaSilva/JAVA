public class Produto {
    private String nome;
    private double preco;
    private int quantidade;


    //nome
    public void setNome(String Nome) {
        this.nome = nome;
    }
    public String getNome() {
        return this.nome;
    }


    //preço
    public double getPreco() {
        return this.preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }


    //quantidade
    public int getQuantidade() {
        return this.quantidade;
    }
    public void setQuantidade(int quantidade) {
        if (quantidade < 0) {
            System.out.println("Quantidade nao pode ser menor que zero");
        } else {
            this.quantidade = quantidade;
        }
    }
}


