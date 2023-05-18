public class Cachorro extends Animal{
    private String latir;

    public Cachorro(String emitirSom, String latir){
        super(emitirSom);
        this.latir = latir;
    }

    public String getLatir() {
        return latir;
    }

    public void setLatir(String latir) {
        this.latir = latir;
    }
}
