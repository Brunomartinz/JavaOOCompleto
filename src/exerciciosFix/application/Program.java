package exerciciosFix.application;

import exerciciosFix.entities.Account;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Account c1 = new Account();

        System.out.println("Enter account number: ");
        c1.setNumber(sc.nextInt());

        System.out.println("Enter account holder: ");
        c1.setHold(sc.next());

        System.out.println("Is there na initial deposit (y/n) ? ");
        String resposta = sc.next();

        if (resposta == "y") {
            System.out.println("Enter initial deposit value: ");
            c1.Deposit(sc.nextInt());

        }else if (resposta =="n") {
            System.out.println();

        }else {
            System.out.println("value invalid");

            }



    }
}
