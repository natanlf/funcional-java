package Match;

import java.util.Arrays;
import java.util.List;

public class StreamIntegerMatch {
    public static void main(String[] args) {
        List<Integer> ls = Arrays.asList(2, 3, 4, 5, 6, 7);

        /*noneMatch: Retorna true se nem um dos elemento do fluxo corresponder ao predicado fornecido.*/
        boolean result = ls.stream().noneMatch( e -> {
            System.out.println("Verificando: " + e);
           return e % 2 == 0;
        });
        System.out.println(result);
    }
}
