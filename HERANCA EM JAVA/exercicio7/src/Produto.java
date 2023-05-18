public class Produto {
    private int codigo;
    private double preco;

    public Produto(int codigo, double preco){
        this.codigo = codigo;
        this.preco = preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getPreco() {
        return preco;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }
}
