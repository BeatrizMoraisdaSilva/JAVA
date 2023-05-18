public class Main {
    public static void main(String[] args) {
        Atacante atacante = new Atacante("Lucas",29);
        atacante.atacar();
        atacante.defender();
        System.out.println("-------------------------");
        MeioCampo meioCampo = new MeioCampo("Messi", 28);
        meioCampo.atacar();
        meioCampo.defender();
        System.out.println("-------------------------");
        Goleiro goleiro = new Goleiro("Marcelo Grohe", 30);
        goleiro.atacar();
        goleiro.defender();

    }
}