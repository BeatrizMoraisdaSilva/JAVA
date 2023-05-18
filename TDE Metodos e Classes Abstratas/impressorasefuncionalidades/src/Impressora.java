public abstract class Impressora {

    protected String nomeImpressora;

    public Impressora(String nomeImpressora){
        this.nomeImpressora = nomeImpressora;
    }
    public abstract void imprimir();
    public abstract void escanear();
}
