public abstract class DispositivoArmazenamento {
    protected String modelo;

    public DispositivoArmazenamento(String modelo) {
        this.modelo = modelo;
    }

    public abstract void lerDados();
    public abstract void gravarDados();
}

