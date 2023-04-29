
/*Exercício 1:
        Criar uma classe "Estudante" com os atributos "nome", "matricula" e "curso".
        Definir construtores para a classe:
        Construtor que recebe todos os atributos como parâmetros.
        Construtor que recebe apenas "nome" e "matricula" e define um valor padrão para "curso".
        Criar objetos do tipo "Estudante" utilizando os construtores definidos.*/
public class Main {
    public static void main(String[] args) {

        Estudante estudante1 = new Estudante("Beatriz", 130415910, "Análise e Desenvolvimento de Sistemas");
        Estudante estudante2 = new Estudante("Lucas", 150254366, "Direito");
        Estudante estudante3 = new Estudante("Amora", 154245874, "Administração");

        System.out.println(estudante1.getNome() + " - " + estudante1.getMatricula() + " - " + estudante1.getCurso());
        System.out.println(estudante2.getNome() + " - " + estudante2.getMatricula() + " - " + estudante2.getCurso());
        System.out.println(estudante3.getNome() + " - " + estudante3.getMatricula() + " - " + estudante3.getCurso());

    }
}