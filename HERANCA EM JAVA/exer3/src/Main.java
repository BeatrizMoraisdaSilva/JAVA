/*3. Crie uma classe "FiguraGeometrica" com os métodos "calcularArea" e"calcular" +
   "Perimetro". Crie uma classe "Quadrado" que herda de "FiguraGeometrica" e
    adiciona um atributo "lado". Crie objetos das classes "FiguraGeometrica" e "Quadrado"
   e chame seus métodos.*/

public class Main {
    public static void main(String[] args) {
        FiguraGeometrica figura = new FiguraGeometrica();
        Quadrado quadrado = new Quadrado(5);

        double areaFigura = figura.calcularArea();
        double perimetroFigura = figura.calcularPerimetro();

        double areaQuadrado = quadrado.calcularArea();
        double perimetroQuadrado = quadrado.calcularPerimetro();

        System.out.println("Área da figura: " + areaFigura);
        System.out.println("Perímetro da figura: " + perimetroFigura);

        System.out.println("Área do quadrado: " + areaQuadrado);
        System.out.println("Perímetro do quadrado: " + perimetroQuadrado);
    }
}