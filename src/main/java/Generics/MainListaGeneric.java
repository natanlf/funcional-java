package Generics;

import java.util.Arrays;
import java.util.List;

public class MainListaGeneric {
    public static void main(String[] args) {
        List<String> langs = Arrays.asList("JS", "PHP", "Java", "C++");
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6);

        String lastLang = (String) ListaUtil.getUltimo(langs);
        System.out.println(lastLang);

        String lastLang2 = ListaUtil.getUltimo2(langs);
        System.out.println(lastLang2);

        Integer ultimoNumero1 = (Integer) ListaUtil.getUltimo(nums);
        System.out.println(ultimoNumero1);

        Integer ultimoNumero2 = ListaUtil.<Integer>getUltimo2(nums);
        System.out.println(ultimoNumero2);
    }
}
