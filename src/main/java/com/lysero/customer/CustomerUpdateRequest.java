package com.lysero.customer;

public record CustomerUpdateRequest(
        String name,
        String email,
        Integer age
) {

}
