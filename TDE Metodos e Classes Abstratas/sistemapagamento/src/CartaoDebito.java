class CartaoDebito extends Pagamento {
    private String numeroCartao;
    private String nomeTitular;

    public CartaoDebito(double valor, String numeroCartao, String nomeTitular) {
        super(valor);
        this.numeroCartao = numeroCartao;
        this.nomeTitular = nomeTitular;
    }

    @Override
    public void realizarPagamento() {
        System.out.println("Pagamento realizado com cartão de débito");
        System.out.println("Dados do cartão: ");
        System.out.println("Número: " + numeroCartao);
        System.out.println("Nome do titular: " + nomeTitular);
        System.out.println("Valor: " + getValor());
    }
    @Override
    public void emitirRecibo() {
        System.out.println("RECIBO DO PAGAMENTO COM CARTÃO DE DEBITO");
        System.out.println("Dados do cartão: ");
        System.out.println("Número: " + numeroCartao);
        System.out.println("Nome do titular: " + nomeTitular);
        System.out.println("Valor: " + getValor());
    }
}