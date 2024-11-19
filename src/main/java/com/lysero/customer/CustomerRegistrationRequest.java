package com.lysero.customer;

public record CustomerRegistrationRequest(
        String name,
        String email,
        Integer age
) {
}
