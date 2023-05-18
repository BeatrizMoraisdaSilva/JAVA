class CartaoCredito extends Pagamento {
    private String numeroCartao;
    private String dataValidade;
    private String nomeTitular;

    public CartaoCredito(double valor, String numeroCartao, String dataValidade, String nomeTitular) {
        super(valor);
        this.numeroCartao = numeroCartao;
        this.dataValidade = dataValidade;
        this.nomeTitular = nomeTitular;
    }

    @Override
    public void realizarPagamento() {
        System.out.println("Pagamento realizado com cartão de crédito");
        System.out.println("Dados do cartão: ");
        System.out.println("Número: " + numeroCartao);
        System.out.println("Data de validade: " + dataValidade);
        System.out.println("Nome do titular: " + nomeTitular);
        System.out.println("Valor: " + getValor());
    }

    @Override
    public void emitirRecibo() {
        System.out.println("RECIBO DO PAGAMENTO COM CARTÃO DE CRÉDITO");
        System.out.println("Dados do cartão: ");
        System.out.println("Número: " + numeroCartao);
        System.out.println("Data de validade: " + dataValidade);
        System.out.println("Nome do titular: " + nomeTitular);
        System.out.println("Valor: " + getValor());
    }
}