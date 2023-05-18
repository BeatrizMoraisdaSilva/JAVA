//1. Calculadora de formas geométricas
//Crie uma classe abstrata "FormaGeometrica" com métodos abstratos
// "calcularArea()" e "calcularPerimetro()". Em seguida, implemente
// classes derivadas para "Circulo", "Retangulo" e "Triangulo", cada
// uma com sua implementação dos métodos abstratos.
public class Main {
    public static void main(String[] args) {
        Circulo circulo = new Circulo(5);
        System.out.println("Área do círculo: " + circulo.calcularArea());
        System.out.println("Perímetro do círculo: " + circulo.calcularPerimetro());

        System.out.println("-------------------------------");

        Retangulo retangulo = new Retangulo(4, 6);
        System.out.println("Área do retângulo: " + retangulo.calcularArea());
        System.out.println("Perímetro do retângulo: " + retangulo.calcularPerimetro());

        System.out.println("-------------------------------");

        Triangulo triangulo = new Triangulo(3, 4, 5);
        System.out.println("Área do triângulo: " + triangulo.calcularArea());
        System.out.println("Perímetro do triângulo: " + triangulo.calcularPerimetro());
    }
}