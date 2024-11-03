package com.lysero;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Objects;

//@SpringBootApplication
@ComponentScan(basePackages = "com.lysero")
@EnableAutoConfiguration
@RestController
public class Main {

    public static void main(String[] args){
        SpringApplication.run(Main.class, args);
    }

    @GetMapping("/greet")
    public GreetResponse greet(){
        return new GreetResponse(
                "Hello",
                List.of("Java", "Golang", "Javascript"), new Person("Tanx", 23, 30_00));
    }

    record Person(String name, int age, double savings){}

    record GreetResponse(
            String greet,
            List<String> favProgrammingLanguages,
            Person person  ){ }

   /* class GreetResponse {
        private final String greet;

        GreetResponse(String greet) {
            this.greet = greet;
        }

        public String getGreet(){
            return greet;
        }

        @Override
        public String toString() {
            return "GreetResponse{" +
                    "greet='" + greet + '\'' +
                    '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            GreetResponse that = (GreetResponse) o;
            return Objects.equals(greet, that.greet);
        }

        @Override
        public int hashCode() {
            return Objects.hash(greet);
        }
    }

*/
}
