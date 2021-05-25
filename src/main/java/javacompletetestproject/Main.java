package javacompletetestproject;

import java.time.LocalDate;

public class Main {

    public static void main(String... args) {
        Customer me = new Customer("Sixro", "6ro", LocalDate.parse("1975-09-11"));
        Customer bram = new Customer("Bram", "Moolenaar", LocalDate.parse("1961-01-01"));

        Company company = new InMemoryCompany("Vim Inc.", new Customer[]{ me, bram });
        System.out.println("Company: " + company);
    }

}
