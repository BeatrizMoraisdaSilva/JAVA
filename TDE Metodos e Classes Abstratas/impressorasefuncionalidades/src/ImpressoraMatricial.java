public class ImpressoraMatricial extends Impressora{
    public ImpressoraMatricial(String nome){
        super(nome);
    }
    @Override
    public void escanear() {
        System.out.println("A impressora a " + nomeImpressora + " está escaneando");
    }

    @Override
    public void imprimir() {
        System.out.println("A impressora a " + nomeImpressora + " está imprimindo");
    }
}