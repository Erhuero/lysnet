package com.lysero;

import org.junit.jupiter.api.Test;
import org.testcontainers.containers.PostgreSQLContainer;

public class TestcontainersTest {

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
