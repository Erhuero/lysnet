package com.lysero.customer;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository("list")
public class CustomerListDataAccessService implements CustomerDao {

    private static List<Customer> customers;

    static {
        customers = new ArrayList<>();

        Customer alex = new Customer(
                1,
                "Alex",
                "topg@tate.com",
                21
        );
        customers.add(alex);

        Customer bang = new Customer(
                2,
                "bang",
                "bang@tate.com",
                22
        );
        customers.add(bang);
    }
    @Override
    public List<Customer> selectAllCustomers(){
        return customers;
    }

    @Override
    public Optional<Customer> selectCustomerById(Integer id) {
       return customers.stream()
                .filter(c -> c.getId().equals(id))
                .findFirst();
    }

    @Override
    public void insertCustomer(Customer customer) {
        customers.add(customer);
    }

    @Override
    public boolean existsPersonWithEmail(String email) {
        return customers.stream().anyMatch(c -> c.getEmail().equals(email));
    }
}
