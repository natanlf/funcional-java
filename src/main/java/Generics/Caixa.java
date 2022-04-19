package Generics;

public class Caixa <T> {
    private T cx;

    public void guardar(T coisa) {
        this.cx = coisa;
    }

    public T abrir() {
        return this.cx;
    }

}
