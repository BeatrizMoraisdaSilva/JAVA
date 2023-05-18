public class Atacante extends Jogador{
    public Atacante(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void atacar() {
        System.out.println("O atacante " + nome + " está atacando!");
    }

    @Override
    public void defender() {
        System.out.println("O atacante " + nome + " não está envolvido na defesa.");
    }
}
