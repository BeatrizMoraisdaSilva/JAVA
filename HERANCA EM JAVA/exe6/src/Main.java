/*6. Crie uma classe "Pessoa" com os métodos "falar" e "andar".
Crie uma classe "Estudante" que herda de "Pessoa" e adiciona um método
 "estudar". Crie objetos das classes "Pessoa" e "Estudante" e chame seus
 métodos.
 */

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        Estudante estudante = new Estudante();

        pessoa.falar();
        pessoa.andar();

        estudante.falar();
        estudante.andar();
        estudante.estudar();
    }
}