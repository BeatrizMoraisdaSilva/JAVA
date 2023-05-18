public class Main {
    public static void main(String[] args) {
        CartaoCredito cartaoCredito = new CartaoCredito(100.0, "1234 5678 9012 3456", "10/25", "Beatriz Morais");
        cartaoCredito.realizarPagamento();
        System.out.println("-");
        cartaoCredito.emitirRecibo();

        System.out.println("--------------------------------");

        CartaoDebito cartaoDebito = new CartaoDebito(50.0, "9876 5432 1098 7654", "Lucas Ayala");
        cartaoDebito.realizarPagamento();
        System.out.println("-");
        cartaoDebito.emitirRecibo();

        System.out.println("--------------------------------");

        Dinheiro dinheiro = new Dinheiro(200.0);
        dinheiro.realizarPagamento();
        System.out.println("-");
        dinheiro.emitirRecibo();
    }
}