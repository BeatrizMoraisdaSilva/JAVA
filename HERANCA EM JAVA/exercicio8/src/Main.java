//8. Crie uma classe "Animal" com o método "mover". Crie uma classe "
// Peixe" que herda de "Animal" e sobrescreve o método "mover" para
// imprimir "Nadando como um peixe". Crie objetos das classes "Animal"
// e "Peixe" e chame seus métodos.
public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Peixe peixe = new Peixe();

        animal.mover();
        peixe.mover();
    }
}