package Generics;

public class MainCaixaNumberGeneric {
    public static void main(String[] args) {
        CaixaNumber<Double> c1 = new CaixaNumber<>();
        c1.guardar(2.0);
        System.out.println(c1.abrir());
    }
}
