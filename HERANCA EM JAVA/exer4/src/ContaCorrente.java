public class ContaCorrente extends Conta {
    private int limite;

    public ContaCorrente(int saldo, int numero, int limite) {
        super(saldo, numero);
        this.limite = limite;
    }

    public int getLimite() {
        return limite;
    }

    public void setLimite(int limite) {
        this.limite = limite;
    }
}
