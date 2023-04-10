public class Main {
    public static void main(String[] args) {
        Produto camisa = new Produto();
        camisa.setNome("Gola Polo");
        camisa.setPreco(89.99);
        camisa.setQuantidade(200);

        Produto calca = new Produto();
        calca.setNome("Jeans");
        calca.setPreco(199.00);
        calca.setQuantidade(100);
        Loja loja1 = new Loja();

        Produto tenis = new Produto();
        tenis.setNome("Adidas");
        tenis.setPreco(399.00);
        tenis.setQuantidade(250);
        loja1.adicionarProduto(camisa);
        loja1.adicionarProduto(calca);
        loja1.adicionarProduto(tenis);

        loja1.listarProdutos();
        loja1.removerProduto(calca);
        loja1.listarProdutos();
        loja1.venderProduto(tenis,100);
        loja1.listarProdutos();
        loja1.adicionarEstoque(tenis, 50);
        loja1.listarProdutos();

    }
}
