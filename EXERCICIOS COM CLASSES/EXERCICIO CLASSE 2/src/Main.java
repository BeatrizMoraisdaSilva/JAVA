/*
Crie uma classe chamada "Carro" que representará um carro. Esta classe deve ter:
Três atributos privados: "marca" (String), "modelo" (String) e "ano" (int).
Métodos públicos para obter (get) e definir (set) os valores dos atributos.
 */
public class Main {
    public static void main(String[] args) {
        Carro meuCarro = new Carro();
        meuCarro.setMarca("BMW");
        meuCarro.setModelo("BMW X6");
        meuCarro.setAno(2020);

        System.out.println("Marca: " + meuCarro.getMarca());
        System.out.println("Modelo: " + meuCarro.getModelo());
        System.out.println("Ano: " + meuCarro.getAno());
    }
}
