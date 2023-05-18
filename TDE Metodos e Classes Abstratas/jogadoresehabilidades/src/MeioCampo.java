public class MeioCampo extends Jogador{
    public MeioCampo(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void atacar() {
        System.out.println("O meio-campista " + nome + " está participando do ataque.");
    }

    @Override
    public void defender() {
        System.out.println("O meio-campista " + nome + " está ajudando na defesa.");
    }
}
