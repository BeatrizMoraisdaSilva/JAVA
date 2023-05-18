public class Navio extends Transporte{
    private int cargaNavio;
    private String destinoNavio;

    public Navio(int numeroVeiculo, int cargaNavio, String destinoNavio){
        super(numeroVeiculo);
        this.cargaNavio = cargaNavio;
        this.destinoNavio = destinoNavio;
    }
    @Override
    public void carregar() {
        System.out.println("O Navio de número " + numeroVeiculo + " está sendo carregado com " + cargaNavio + " kg de carga, para " + destinoNavio);
    }

    @Override
    public void descarregar() {
        System.out.println("O Navio de número " + numeroVeiculo + " está descarregando a quantia de " + cargaNavio + " kg de carga, em " + destinoNavio);

    }
}
