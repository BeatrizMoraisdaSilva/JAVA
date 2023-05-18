public class Pendrive extends DispositivoArmazenamento{
    public Pendrive(String modelo) {
        super(modelo);
    }

    @Override
    public void lerDados() {
        System.out.println("Lendo dados do pendrive " + modelo);
    }

    @Override
    public void gravarDados() {
        System.out.println("Gravando dados no pendrive " + modelo);
    }
}