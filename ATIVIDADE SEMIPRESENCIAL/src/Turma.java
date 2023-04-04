import java.util.ArrayList;
import java.util.List;

public class Turma {

    private List<Aluno> alunos = new ArrayList<>();

    public void addAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    public double calcularMediaTurma() {
        double soma = 0;
        for (Aluno aluno : alunos) {
            soma += aluno.calcularMedia();
        }
        return soma / alunos.size();
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }
}
