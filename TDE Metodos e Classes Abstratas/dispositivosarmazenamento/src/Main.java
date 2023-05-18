public class Main {
    public static void main(String[] args) {
        Pendrive pendrive = new Pendrive("Kingston");
        pendrive.lerDados();
        pendrive.gravarDados();
        System.out.println("-------------------------");
        HDExterno hdExterno = new HDExterno("Seagate");
        hdExterno.lerDados();
        hdExterno.gravarDados();
    }
}