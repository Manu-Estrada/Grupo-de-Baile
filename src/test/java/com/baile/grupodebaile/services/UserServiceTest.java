package com.baile.grupodebaile.services;

import static org.mockito.Mockito.when;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.baile.grupodebaile.models.User;
import com.baile.grupodebaile.repositories.UserRepository;


@ExtendWith(MockitoExtension.class)
public class UserServiceTest {

    @InjectMocks
    UserService service;

    @Mock
    UserRepository repository;

    User user1 = new User(null, "Primera", "Prueba", null, "", "", null);
    User user2 = new User(null, "Segunda", "Prueba", null, "", "", null);

    @Test
    void testListAll() {
        List<User> users = new ArrayList<>();

        users.add(user1);
        users.add(user2);

        when(repository.findAll()).thenReturn(users);

        List<User> reponseRolesTest = service.listAll();

        assertThat(reponseRolesTest.size()).isEqualTo(2);
        assertThat(reponseRolesTest.get(0).getName()).isEqualTo("Primera");
        assertThat(reponseRolesTest.get(1).getName()).isEqualTo("Segunda");
    }

    @Test
    void testListOne() {
        when(repository.findById((long) 1)).thenReturn(Optional.of(user1));
        service.listOne((long) 1);
        assertThat(user1.getName()).isEqualTo("Primera");
    }

    @Test
    void testDelete() {
        when(repository.findById((long) 1)).thenReturn(Optional.of(user1));
        service.listOne((long) 1);
        service.delete((long) 1);
        User user = service.listOne((long) 1);
        assertEquals(user.getName(), "Primera");
    }

    @Test
    void testListOneByName() {

    }

    @Test
    void testStore() {

    }
}
