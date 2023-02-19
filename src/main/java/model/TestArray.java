package model;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class TestArray {
    public static void main(String[] args) {
        AllCustomers customer1 = new Costumer();
        customer1.setNome("Hananias");
        customer1.setProfissao("Developer");

        AllCustomers customer2 = new Costumer();
        customer2.setNome("Azarias");
        customer2.setProfissao("Scrum");

        AllCustomers customer3 = new Costumer();
        customer3.setNome("Misael");
        customer3.setProfissao("Product Owner");

        AllCustomers customer4 = new Costumer();
        customer4.setNome("Daniel");
        customer4.setProfissao("DevOps");


        List<AllCustomers> lista = new ArrayList<>();
        lista.add(customer1);
        lista.add(customer2);
        lista.add(customer3);
        lista.add(customer4);

        for (AllCustomers customers : lista )
        { System.out.println(customers.getNome() + ", " + customers.getProfissao()); }

       // lista.forEach((customer) -> System.out.println(customer.getNome() + ", " + customer.getProfissao()));

    }
}
