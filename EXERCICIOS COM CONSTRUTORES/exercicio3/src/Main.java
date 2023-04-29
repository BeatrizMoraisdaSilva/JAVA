/*Exercício 3:
Criar uma classe "Cachorro" com os atributos "nome", "raca" e "idade".
Definir construtores para a classe:
Construtor que recebe todos os atributos como parâmetros.
Construtor que recebe apenas "nome" e "raca" e define um valor padrão para "idade".
Criar objetos do tipo "Cachorro" utilizando os construtores definidos*/
public class Main {
    public static void main(String[] args) {

        Cachorro cachorro1 = new Cachorro("Bela", "Yorkshire", 3);
        Cachorro cachorro2 = new Cachorro("Anubis", "Doberman");

        System.out.println(cachorro1.getNome() + " - " + cachorro1.getRaca() + " - " + cachorro1.getIdade());
        System.out.println(cachorro2.getNome() + " - " + cachorro2.getRaca() + " - " + cachorro2.getIdade());

    }
}