public abstract class Transporte {

    protected int numeroVeiculo;

    public Transporte(int numeroVeiculo){
        this.numeroVeiculo = numeroVeiculo;
    }
    public abstract void carregar();
    public abstract void descarregar();

}
