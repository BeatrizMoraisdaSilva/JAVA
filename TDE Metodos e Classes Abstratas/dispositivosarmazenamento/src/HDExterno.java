public class HDExterno extends DispositivoArmazenamento{
    public HDExterno(String modelo) {
        super(modelo);
    }

    @Override
    public void lerDados() {
        System.out.println("Lendo dados do HD externo " + modelo);
    }

    @Override
    public void gravarDados() {
        System.out.println("Gravando dados no HD externo " + modelo);
    }
}

