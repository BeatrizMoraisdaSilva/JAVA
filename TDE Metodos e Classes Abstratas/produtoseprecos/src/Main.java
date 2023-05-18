public class Main {
    public static void main(String[] args) {
            Livro livro = new Livro("Aventuras Fantásticas", 29.99, "J.R.R. Tolkien", "O Senhor dos Anéis");
            livro.exibirDetalhes();

            System.out.println("-----------------------------");
            Roupa roupa = new Roupa("Camiseta", 39.99, "M", "Azul");
            roupa.exibirDetalhes();

            System.out.println("-----------------------------");
            Eletronico eletronico = new Eletronico("Smartphone", 999.99, "Samsung", "Galaxy S20");
            eletronico.exibirDetalhes();
        }
    }

