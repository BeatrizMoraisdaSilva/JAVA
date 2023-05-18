public class Equipe {
    private String nome;
    private int vitorias;
    private int derrotas;
    private int empates;
    private int pontos;


    public Equipe(String nome){
        this.nome = nome;
        this.vitorias = 0;
        this.derrotas = 0;
        this.empates = 0;
        this.pontos = 0;
    }

    public int getPontos() {
        return pontos;
    }

    public void setPontos(int pontos) {
        this.pontos = pontos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }

    public void registrarVitoria() {
        this.vitorias++;
        this.pontos += 3;
    }

    public void registrarDerrota() {
        this.derrotas++;
    }

    public void registrarEmpate() {
        this.empates++;
        this.pontos ++;
    }
    public void exibirInfo(){
        System.out.println("Derrotas" + this.derrotas);
        System.out.println("Vitórias: " + this.vitorias);
        System.out.println("Empates: " + this.empates);
        System.out.println("Pontos: " + this.pontos);

    }
}
