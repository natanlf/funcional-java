package Generics;

public class MainCaixaGeneric {
    public static void main(String[] args) {
        Caixa<String> c1 = new Caixa<>();
        c1.guardar("Texto");
        System.out.println(c1.abrir());

        Caixa<Double> c2 = new Caixa<>();
        c2.guardar(10.2);
        System.out.println(c2.abrir());
    }
}
