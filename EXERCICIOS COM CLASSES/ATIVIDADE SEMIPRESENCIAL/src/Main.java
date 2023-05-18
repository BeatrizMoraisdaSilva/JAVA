import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Turma turma = new Turma();

        Aluno aluno1 = new Aluno("Aluno 1");
        Prova prova1Aluno1 = new Prova(6.5);
        Prova prova2Aluno1 = new Prova(8.0);
        aluno1.addProva(prova1Aluno1);
        aluno1.addProva(prova2Aluno1);

        Aluno aluno2 = new Aluno("Aluno 2");
        Prova prova1Aluno2 = new Prova(10.0);
        Prova prova2Aluno2 = new Prova(3.0);
        aluno2.addProva(prova1Aluno2);
        aluno2.addProva(prova2Aluno2);

        Aluno aluno3 = new Aluno("Aluno 3");
        Prova prova1Aluno3 = new Prova(9.0);
        Prova prova2Aluno3 = new Prova(7.5);
        aluno3.addProva(prova1Aluno3);
        aluno3.addProva(prova2Aluno3);

        turma.addAluno(aluno1);
        turma.addAluno(aluno2);
        turma.addAluno(aluno3);

        double mediaTurma = turma.calcularMediaTurma();
        System.out.println("Média da turma: " + mediaTurma);

        for (Aluno aluno : turma.getAlunos()) {
            double mediaAluno = aluno.calcularMedia();
            System.out.println("Média do aluno " + aluno.getNome() + ": " + mediaAluno);
        }
    }
}
