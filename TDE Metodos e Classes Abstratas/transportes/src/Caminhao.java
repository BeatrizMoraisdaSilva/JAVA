public class Caminhao extends Transporte{
    private int quantiaCarga;
    private String destino;

    public Caminhao(int numeroVeiculo, int quantiaCarga, String destino){
        super(numeroVeiculo);
        this.quantiaCarga = quantiaCarga;
        this.destino = destino;
    }
    @Override
    public void carregar() {
        System.out.println("O Caminhao de número " + numeroVeiculo + " está sendo carregado com " + quantiaCarga + " kg de carga, para " + destino);
    }

    @Override
    public void descarregar() {
        System.out.println("O Caminhao de número " + numeroVeiculo + " está descarregando a quantia de " + quantiaCarga + " kg de carga, em " + destino);

    }
}
