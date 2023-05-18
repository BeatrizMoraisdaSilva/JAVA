public class Goleiro extends Jogador{
    public Goleiro(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void atacar() {
        System.out.println("O goleiro " + nome + " não participa do ataque.");
    }

    @Override
    public void defender() {
        System.out.println("O goleiro " + nome + " está defendendo o gol!");
    }
}
