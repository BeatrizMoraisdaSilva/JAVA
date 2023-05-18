public abstract class Pagamento {
    private double valor;

    public Pagamento(double valor){
        this.valor = valor;
    }
    public abstract void realizarPagamento();
    public abstract void emitirRecibo();

    public double getValor(){
        return valor;
    }


}
