package com.lysero;

import com.lysero.customer.Customer;
import com.lysero.customer.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class Main {

    public static void main(String[] args){
        SpringApplication.run(Main.class, args);
    }

    @Bean
    CommandLineRunner runner(CustomerRepository customerRepository){

        return args -> {

            Customer alex = new Customer(
                    "Alex",
                    "topg@tate.com",
                    21
            );

            Customer bang = new Customer(
                    "bang",
                    "bang@tate.com",
                    22
            );

            List<Customer> customers = List.of(alex, bang);
            customerRepository.saveAll(customers);

        };
    }

}
