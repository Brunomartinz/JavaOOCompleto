package applicattion;

import entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Product product = new Product();

        System.out.println("Enter Product Data");
        System.out.println("Name:");
        product.setName(sc.next());
        System.out.println("Price");
        product.setPrice(sc.nextDouble());
        System.out.println("Quantity:");
        product.setQuantity(sc.nextInt());



        System.out.println();
        System.out.println("Product data "+product);

        System.out.println("Enter the number of products to be added in stock");
        int quantity = sc.nextInt();
        product.addProducts(quantity);
        System.out.println("Updated data: " + product);

        System.out.println("Enter the number of products to be removed from stock");
        quantity = sc.nextInt();
        product.removeProducts(quantity);
        System.out.println("Updated data: " + product);


        sc.close();
    }
}
