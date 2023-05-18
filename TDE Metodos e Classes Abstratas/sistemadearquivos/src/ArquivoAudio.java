public class ArquivoAudio extends Arquivo{

    @Override
    public void abrir() {
        System.out.println("Abrindo arquivo de áudio!");
    }

    @Override
    public void fechar() {
        System.out.println("Fechando arquivo de áudio!");
    }
}
