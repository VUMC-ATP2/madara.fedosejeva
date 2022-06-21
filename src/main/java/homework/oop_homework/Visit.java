package homework.oop_homework;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

@ToString
public class Visit {
    Customer customer;                        // "customer" - mainigais/objekts ar tipu (no klases) "Customer"
    Date date;
    @Getter
    @Setter
    private double serviceExpense;
    @Getter
    @Setter
    private double productExpense;


    public Visit(Customer customer, Date date) {      // "Customer customer" - tiek gaidīts klases "Customer" objekts, sanak, "madara" (Customer madara = new Customer("Madara");)
        this.customer = customer;
        this.date = date;
    }

    public String getCustomer() {
        return customer.getName();
    }

    public double getServiceExpense() {
        return serviceExpense * (1 - DiscountRate.getServiceDiscountRate(customer.getMemberType()));
    }

    public double getProductExpense() {
        return productExpense * (1 - DiscountRate.getProductDiscountRate(customer.getMemberType()));
    }

    public double getTotalExpense() {
        return serviceExpense * (1 - DiscountRate.getServiceDiscountRate(customer.getMemberType()))
                + productExpense * (1 - DiscountRate.getProductDiscountRate(customer.getMemberType()));
    }
}
