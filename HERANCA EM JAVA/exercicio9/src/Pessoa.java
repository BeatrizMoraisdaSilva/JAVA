public class Pessoa {
    private String nome;
    private String endereco;

    public Pessoa(String nome, String endereco){
        this.nome = nome;
        this.endereco = endereco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}
