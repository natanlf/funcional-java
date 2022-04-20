package Generics.generics2;

import Generics.generics2.entities.Product;
import Generics.generics2.services.CalculationService;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Product p1 = new Product("TV", 2300.00);
        Product p3 = new Product("Cellphone", 1600.00);
        Product p2 = new Product("Computer", 5300.00);
        Product p4 = new Product("Mouse", 45.00);

        List<Product> list = Arrays.asList(p1, p2, p3, p4);

        Product mostExpensive = CalculationService.max(list);
        System.out.println("Most Expensive Product = " + mostExpensive);
    }
}
