package Generics;

import java.util.List;

public class ListaUtil {

    /*
    * Não sabe qual é o tipo da lista, ao chamar preciso fazer um cast para o tipo da lista
    * */
    public static Object getUltimo(List<?> lista) {
        return lista.get(lista.size() - 1);
    }

    /*
    * Sabe qual é o tipo da lista, assim não preciso fazer o cast
    * */
    public static <T> T getUltimo2(List<T> lista) {
        return lista.get(lista.size() - 1);
    }
}
