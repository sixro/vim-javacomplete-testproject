package javacompletetestproject;

import java.util.Arrays;

public class InMemoryCompany implements Company {

    private final String name;
    private final Customer[] customers;

    public InMemoryCompany(String name, Customer[] customers) {
        this.name = name;
        this.customers = customers;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Customer[] getCustomers() {
        return customers;
    }

    @Override
    public String toString() {
        return "InMemoryCompany{" + "name='" + name + '\'' + ", customers=" + Arrays.toString(customers) + '}';
    }
}
