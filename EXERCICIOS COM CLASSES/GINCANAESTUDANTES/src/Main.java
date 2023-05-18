public class Main {
        public static void main(String[] args) {
                // objetos Estudante
                Estudante estudante1 = new Estudante("Lucas", 18, 13);
                Estudante estudante2 = new Estudante("Beatriz", 17, 15);
                Estudante estudante3 = new Estudante("Brenda", 19, 14);

                // criando gincana
                Gincana gincana = new Gincana("Gincana 2023:");

                // adicionando estudantes à gincana
                gincana.adicionarEstudante(estudante1);
                gincana.adicionarEstudante(estudante2);
                gincana.adicionarEstudante(estudante3);

                // estudante vencedor e sua pontuação
                gincana.exibirVencedor();
        }
}

