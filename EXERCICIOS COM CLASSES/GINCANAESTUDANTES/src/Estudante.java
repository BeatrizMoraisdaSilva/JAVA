public class Estudante{

    private String nome;
    private int idade;
    private int pontos;

    public Estudante(String nome, int idade, int pontos) {
        this.nome = nome;
        this.idade = idade;
        this.pontos = pontos;
    }
    // Getters
    public String getNome() {
        return nome;
    }

    public int getIdade(){
        return idade;
    }

    public int getPontos(){
        return pontos;
    }

    // Setters
    public void setNome(String Nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setPontos(int pontos){
        this.pontos = pontos;
    }


}
