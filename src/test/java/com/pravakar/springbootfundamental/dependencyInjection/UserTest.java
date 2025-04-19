package com.pravakar.springbootfundamental.dependencyInjection;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class UserTest {

//    private Order order;
//    private User user;

//    @BeforeEach
//    void setUp() {
//        this.order = Mockito.mock(Order.class);
//        this.user = new User();
//    }
//
//    @Test
//    void processOrder() {
//        order.process();
//        user.processOrder();
//    }

    @Mock
    private Order order;

    @InjectMocks
    private User user;
    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void processOrder() {
        order.process();
    }

    @Test
    void testUsersOrder() {
        user.processOrder();
    }

    @AfterEach
    void tearDown() {
    }
}