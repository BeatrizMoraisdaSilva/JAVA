//10. Crie uma classe "Animal" com o método "emitirSom".
// Crie uma classe "Gato" que herda de "Animal" e sobrescreve o
// método "emitirSom" para imprimir "Miau!". Crie objetos das classes
// "Animal" e "Gato" e chame seus métodos.
public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Gato gato = new Gato();

        animal.emitirSom();
        gato.emitirSom();
    }
}