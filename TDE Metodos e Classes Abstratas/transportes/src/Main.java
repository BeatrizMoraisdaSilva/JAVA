public class Main {
    public static void main(String[] args) {
        Caminhao caminhao = new Caminhao(1345513, 300,"Mato Grosso");
        caminhao.carregar();
        caminhao.descarregar();
        System.out.println("------------------------------");
        Trem trem = new Trem(934521,270,"São Paulo");
        trem.carregar();
        trem.descarregar();
        System.out.println("------------------------------");
        Navio navio = new Navio(45632, 652, "Porto Alegre");
        navio.carregar();
        navio.descarregar();
    }
}