package Match;

import java.util.Arrays;
import java.util.List;

public class StreamStringMatch {
    public static void main(String[] args) {

        List<String> itensPermitidos = List.of("Stream", "Canetas");

        List<String> ls = Arrays.asList("Receitas", "Código", "Stream", "allMatch", "Canetas");

        /*noneMatch: Retorna true se nem um dos elemento do fluxo corresponder ao predicado fornecido.*/
        boolean result = ls.stream().noneMatch(name -> {
            var resultItem = itensPermitidos.stream().anyMatch(name::matches);
            System.out.println("Verify: " + name +" - Resultado: " + resultItem);
            return resultItem;
        });
        System.out.println("Resultado: " + result);
    }
}
