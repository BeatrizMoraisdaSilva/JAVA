/*Exercício 2:
        Criar uma classe "Livro" com os atributos "titulo", "autor" e "preco".
        Definir construtores para a classe:
        Construtor que recebe todos os atributos como parâmetros.
        Construtor que recebe apenas "titulo" e "autor" e define um valor padrão para "preco".
        Criar objetos do tipo "Livro" utilizando os construtores definidos.*/

public class Main {
    public static void main(String[] args) {
        Livro livro1 = new Livro("Código da Vinci", "Dan Brown", 29.90);
        Livro livro2 = new Livro("Dom Casmurro", "Machado de Assis");

        System.out.println("Livro:" + livro1.getTitulo() + " - " + livro1.getAutor() + " - " + livro1.getPreco());
        System.out.println("Livro:" + livro2.getTitulo() + " - " + livro2.getAutor() + " - " + livro2.getPreco());


    }
}