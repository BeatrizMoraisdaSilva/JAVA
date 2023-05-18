/*5. Crie uma classe "Animal" com o método "emitirSom".
Crie uma classe "Cachorro" que herda de "Animal" e adiciona
um método "latir". Crie objetos das classes "Animal" e "Cachorro" e
chame seus métodos.
 */

public class Main {
    public static void main(String[] args) {

        Animal cachorro1 = new Animal("Au au");

        System.out.println("Latido do Animal: " + cachorro1.getEmitirSom());
    }
}