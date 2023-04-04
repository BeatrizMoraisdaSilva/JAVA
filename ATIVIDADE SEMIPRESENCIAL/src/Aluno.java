import java.util.ArrayList;
import java.util.List;

public class Aluno {

    private String nome;
    private List<Prova> provas = new ArrayList<>();
    private double media;

    public Aluno(String nome) {
        this.nome = nome;
    }

    public void addProva(Prova prova) {
        provas.add(prova);
    }

    public double calcularMedia() {
        double soma = 0;
        if (provas != null && !provas.isEmpty()) {
            for (Prova prova : provas) {
                soma += prova.getNota();
            }
            return soma / provas.size();
        } else {
            return 0;
        }

}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Prova> getProvas() {
        return provas;
    }

    public void setProvas(List<Prova> provas) {
        this.provas = provas;
    }

    public double getMedia() {
        return media;
    }
}
