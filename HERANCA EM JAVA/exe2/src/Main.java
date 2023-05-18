/*Crie uma classe "Veiculo" com os atributos "marca" e "modelo"
. Crie uma classe "Carro" que herda de "Veiculo" e
adiciona um atributo "numPassageiros". Crie objetos
das classes "Veiculo" e "Carro" e atribua valores aos
seus atributos.*/

public class Main {
    public static void main(String[] args) {
        Carro carro1 = new Carro("Toytota", "Corolla", 2);
            Carro carro2 = new Carro("Chevrolet", "Onix", 4);


        System.out.println("Dados Veiculo 1");
        System.out.println("Marca: " + carro1.getMarca());
        System.out.println("Modelo: " + carro1.getModelo());
        System.out.println("Número de Passageiros: " + carro1.getNumPassageiros());
        System.out.println("-----------------------------");
        System.out.println("Dados Veiculo 2");
        System.out.println("Marca: " + carro2.getMarca());
        System.out.println("Modelo: " + carro2.getModelo());
        System.out.println("Número de Passageiros: " + carro2.getNumPassageiros());



    }
}