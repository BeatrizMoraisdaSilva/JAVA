public class Trem extends Transporte{

    private int cargaTrem;
    private String destinoTrem;

    public Trem(int numeroVeiculo, int cargaTrem, String destinoTrem){
        super(numeroVeiculo);
        this.cargaTrem = cargaTrem;
        this.destinoTrem = destinoTrem;
    }
    @Override
    public void carregar() {
        System.out.println("O Trem de número " + numeroVeiculo + " está sendo carregado com " + cargaTrem + " kg de carga, para " + destinoTrem);
    }

    @Override
    public void descarregar() {
        System.out.println("O Trem de número " + numeroVeiculo + " está descarregando a quantia de " + cargaTrem + " kg de carga, em " + destinoTrem);

    }
}