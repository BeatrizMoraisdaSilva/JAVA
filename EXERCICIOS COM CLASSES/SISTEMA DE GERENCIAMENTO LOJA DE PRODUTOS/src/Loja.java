public class Loja {

    Produto produto1;
    Produto produto2;
    Produto produto3;


    //adicionar produto

    public void adicionarProduto(Produto produto) {
        if (this.produto1 == null) {
            this.produto1 = produto;
        } else if (this.produto2 == null) {
            this.produto2 = produto;
        } else if (this.produto3 == null) {
            this.produto3 = produto;
        } else {
            System.out.println("Todos os produtos foram preenchidos");
        }

    }

    public void removerProduto(Produto produto) {
        if (this.produto1 == produto) {
            this.produto1 = null;
        } else if (this.produto2 == produto) {
            this.produto2 = null;
        } else if (this.produto3 == produto) {
            this.produto3 = null;
        } else {
            System.out.println("Produto não encontrado");
        }

    }

    public void listarProdutos() {
        if (this.produto1 != null) {
            imprimirProduto(this.produto1);
        }
        if (this.produto2 != null) {
            imprimirProduto(this.produto2);
        }
        if (this.produto3 != null) {
            imprimirProduto(this.produto3);
        }

    }

    private void imprimirProduto(Produto produto) {
        System.out.println("Nome do produto: " + produto.getNome() + "Preço" + produto.getPreco() + "Quantidade" + produto.getQuantidade());
    }

    public void venderProduto(Produto produto, int quantidade) {
        if (this.produto1 == produto) {
            if (this.produto1.getQuantidade() >= quantidade) {
                int quantidadeProduto = this.produto1.getQuantidade();
                quantidadeProduto = quantidadeProduto - quantidade;
                this.produto1.setQuantidade(quantidadeProduto);
            } else if (this.produto2 == produto) {
                if (this.produto2.getQuantidade() >= quantidade) {
                    int quantidadeProduto = this.produto2.getQuantidade();
                    quantidadeProduto = quantidadeProduto - quantidade;
                    this.produto2.setQuantidade(quantidadeProduto);
                }
            }
        } else if (this.produto3 == produto) {
            if (this.produto3.getQuantidade() >= quantidade) {
                int quantidadeProduto = this.produto3.getQuantidade();
                quantidadeProduto = quantidadeProduto - quantidade;
                this.produto3.setQuantidade(quantidadeProduto);
            }
        }else
        System.out.println("Produto nao encontrado");
    }
        public void adicionarEstoque (Produto produto,int quantidade){
            if(this.produto1 == produto){
                this.produto1.setQuantidade(this.produto1.getQuantidade() + quantidade);
            } else if (this.produto2 == produto) {
                this.produto2.setQuantidade(this.produto2.getQuantidade() + quantidade);
            } else if (this.produto3 == produto) {
                this.produto3.setQuantidade((this.produto3.getQuantidade() + quantidade));
            }

        }
    }








