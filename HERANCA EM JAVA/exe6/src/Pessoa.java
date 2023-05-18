public class Pessoa {
    private String falar;
    private String andar;


    public void falar() {
        System.out.println("A pessoa está falando.");
    }

    public void andar() {
        System.out.println("A pessoa está andando.");
    }
    public String getAndar() {
        return andar;
    }

    public void setAndar(String andar) {
        this.andar = andar;
    }

    public String getFalar() {
        return falar;
    }

    public void setFalar(String falar) {
        this.falar = falar;
    }
}
