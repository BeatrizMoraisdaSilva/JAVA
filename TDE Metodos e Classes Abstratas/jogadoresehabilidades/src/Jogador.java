public abstract class Jogador{

    protected String nome;
    protected int idade;

    public Jogador(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public abstract void atacar();
    public abstract void defender();

}
