public class Main {
    public static void main(String[] args) {
        ImpressoraJatoTinta impressoraJatoTinta = new ImpressoraJatoTinta("Tinta");
        impressoraJatoTinta.imprimir();
        impressoraJatoTinta.escanear();
        System.out.println("----------------------------------");
        ImpressoraLaser impressoraLaser = new ImpressoraLaser("Laser");
        impressoraLaser.imprimir();
        impressoraLaser.escanear();
        System.out.println("----------------------------------");
        ImpressoraMatricial impressoraMatricial = new ImpressoraMatricial("Matriarcal");
        impressoraMatricial.imprimir();
        impressoraMatricial.escanear();
    }
}