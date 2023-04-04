/*
Crie uma classe chamada "Pessoa" que representará uma pessoa. Esta classe deve ter:
Três atributos privados: "nome" (String), "idade" (int) e "altura" (double).
Métodos públicos para obter (get) e definir (set) os valores dos atributos.
 */
public class Main {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();
        pessoa1.setNome("Lucas");
        pessoa1.setIdade(29);
        pessoa1.setAltura(1.75);

        System.out.println("Nome: " + pessoa1.getNome());
        System.out.println("Idade: " + pessoa1.getIdade());
        System.out.println("Altura: " + pessoa1.getAltura());
    }
}
