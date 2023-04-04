public class Prova {

    private double nota;

    public Prova(double nota) {
        if (nota < 0) {
            this.nota = 0;
        } else if (nota > 10) {
            this.nota = 10;
        } else {
            this.nota = nota;
        }
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        if (nota < 0) {
            this.nota = 0;
        } else if (nota > 10) {
            this.nota = 10;
        } else {
            this.nota = nota;
        }
    }
}
