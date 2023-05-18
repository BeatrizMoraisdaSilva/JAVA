class Dinheiro extends Pagamento {
    public Dinheiro(double valor) {
        super(valor);
    }

    @Override
    public void realizarPagamento() {
        System.out.println("Pagamento realizado em dinheiro");
        System.out.println("Valor: " + getValor());

    }
    @Override
    public void emitirRecibo() {
        System.out.println("Recibo do pagamento em dinheiro no valor de R$");
        System.out.println("Valor:" + getValor());
    }
}