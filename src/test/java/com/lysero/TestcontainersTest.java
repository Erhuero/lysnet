package com.lysero;

import org.junit.jupiter.api.Test;
import org.testcontainers.containers.PostgreSQLContainer;
import org.testcontainers.junit.jupiter.Container;
import org.testcontainers.junit.jupiter.Testcontainers;

@Testcontainers
public class TestcontainersTest {

    @Container
    private static final PostgreSQLContainer<?> postgreSQLContainer = new PostgreSQLContainer<>("postgres:latest")
            .withDatabaseName("lysero-dao-unit-test")
            .withUsername("lysero")
            .withPassword("password");

    @Test
    void canStartPostgresDB() {
        //Given
        //When

        //Then
    }
}
