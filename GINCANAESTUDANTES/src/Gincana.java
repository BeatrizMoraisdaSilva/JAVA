class Gincana {
    private String nomeGincana;
    private int totalEstudantes;
    private Estudante estudanteVencedor;
    private int pontuacaoMaxima;

    // construtor da gincana
    public Gincana(String nomeGincana) {
        this.nomeGincana = nomeGincana;
        this.totalEstudantes = 0;
        this.estudanteVencedor = null;
        this.pontuacaoMaxima = 0;
    }

    // get e set
    public String getNomeGincana() {
        return nomeGincana;
    }

    public void setNomeGincana(String nomeGincana) {
        this.nomeGincana = nomeGincana;
    }

    public int getTotalEstudantes() {
        return totalEstudantes;
    }

    public Estudante getEstudanteVencedor() {
        return estudanteVencedor;
    }

    public int getPontuacaoMaxima() {
        return pontuacaoMaxima;
    }

    // adicionando um estudante
    public void adicionarEstudante(Estudante estudante) {
        totalEstudantes++;
        if (estudante.getPontos() > pontuacaoMaxima) {
            estudanteVencedor = estudante;
            pontuacaoMaxima = estudante.getPontos();
        }
    }

    // exibindo o vencedor
    public void exibirVencedor() {
        System.out.println("Estudante Vencedor: " + estudanteVencedor.getNome());
        System.out.println("Idade: " + estudanteVencedor.getIdade());
        System.out.println("Pontuação: " + estudanteVencedor.getPontos());
    }
}