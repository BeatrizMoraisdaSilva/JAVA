public class Conta {
    private int saldo;
    private int numero;

    public Conta(int saldo, int numero){
        this.saldo = saldo;
        this.numero = numero;
    }
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
}
