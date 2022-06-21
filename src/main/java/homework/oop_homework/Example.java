package homework.oop_homework;

import java.util.Date;

public class Example {

    public static void main(String[] args) {

// Client without subscription "Madara":
        Customer madara = new Customer("Madara");                   // jauns klases "Customer" objekts "madara"
        System.out.println(madara.getName() + " has subscription to our products and services: " + madara.isMember() + ". Her loyalty level is " + madara.getMemberType());

        Date date = new Date();                                           // sii briza precizs datums un laiks
        Visit visitMadara = new Visit(madara, date);                      // jauns klases "Visit" objekts "visitAnna" ar objektu "madara" un precizu laiku
        visitMadara.setServiceExpense(100);
        visitMadara.setProductExpense(100);
        System.out.println(visitMadara);
        System.out.println("Client " + visitMadara.getCustomer() + " costs about services: " + visitMadara.getServiceExpense());
        System.out.println("Client " + visitMadara.getCustomer() + " costs about products: " + visitMadara.getProductExpense());
        System.out.println("Client " + visitMadara.getCustomer() + " TOTAL costs: " + visitMadara.getTotalExpense());

        System.out.println(" ");


// Client with subscription Silver "Anna":
        Customer anna = new Customer("Anna");
        anna.setMember(true);
        anna.setMemberType("Silver");
        System.out.println(anna.getName() + " has subscription to our products and services: " + anna.isMember() + ". Her loyalty level is " + anna.getMemberType());

        Date date2 = new Date();
        Visit visitAnna = new Visit(anna, date2);
        visitAnna.setServiceExpense(100);
        visitAnna.setProductExpense(100);
        System.out.println(visitAnna);
        System.out.println("Client " + visitAnna.getCustomer() + " costs about services: " + visitAnna.getServiceExpense());
        System.out.println("Client " + visitAnna.getCustomer() + " costs about products: " + visitAnna.getProductExpense());
        System.out.println("Client " + visitAnna.getCustomer() + " TOTAL costs: " + visitAnna.getTotalExpense());

        System.out.println(" ");


// Client with subscription Gold "Karlis":
        Customer karlis = new Customer("Karlis");
        karlis.setMember(true);
        karlis.setMemberType("Gold");
        System.out.println(karlis.getName() + " has subscription to our products and services: " + karlis.isMember() + ". His loyalty level is " + karlis.getMemberType());

        Date date3 = new Date();
        Visit visitKarlis = new Visit(karlis, date3);
        visitKarlis.setServiceExpense(100);
        visitKarlis.setProductExpense(100);
        System.out.println(visitKarlis);
        System.out.println("Client " + visitKarlis.getCustomer() + " costs about services: " + visitKarlis.getServiceExpense());
        System.out.println("Client " + visitKarlis.getCustomer() + " costs about products: " + visitKarlis.getProductExpense());
        System.out.println("Client " + visitKarlis.getCustomer() + " TOTAL costs: " + visitKarlis.getTotalExpense());

        System.out.println(" ");


// Client with subscription Premium "Peteris":
        Customer peteris = new Customer("Peteris");
        peteris.setMember(true);
        peteris.setMemberType("Premium");
        System.out.println(peteris.getName() + " has subscription to our products and services: " + peteris.isMember() + ". His loyalty level is " + peteris.getMemberType());

        Date date4 = new Date();
        Visit visitPeteris = new Visit(peteris, date4);
        visitPeteris.setServiceExpense(100);
        visitPeteris.setProductExpense(100);
        System.out.println(visitPeteris);
        System.out.println("Client " + visitPeteris.getCustomer() + " costs about services: " + visitPeteris.getServiceExpense());
        System.out.println("Client " + visitPeteris.getCustomer() + " costs about products: " + visitPeteris.getProductExpense());
        System.out.println("Client " + visitPeteris.getCustomer() + " TOTAL costs: " + visitPeteris.getTotalExpense());
    }
}
