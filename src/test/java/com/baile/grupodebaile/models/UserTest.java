package com.baile.grupodebaile.models;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class UserTest {

    User userEmpty = new User();
    User userFull = new User(null, "Prueba", "Primera", null, "", "", null);

    @Test
    void test_set_name_empty_user() {
        userEmpty.setName("Paco");
        assertEquals("Paco", userEmpty.getName());

    }

    @Test
    void test_modify_name_full_user() {
        userFull.setName("Paco");
        assertEquals("Paco", userFull.getName());
    }
}

