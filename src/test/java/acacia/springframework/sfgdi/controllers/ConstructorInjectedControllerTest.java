package acacia.springframework.sfgdi.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import acacia.springframework.sfgdi.services.GreetingService;
import acacia.springframework.sfgdi.services.GreetingServiceImpl;

class ConstructorInjectedControllerTest {
    ConstructorInjectedController controller;

    @BeforeEach
    void setUp() {

        controller = new ConstructorInjectedController(new GreetingServiceImpl());

    }

    @Test
    void getGreeting() {

        System.out.println(controller.getGreeting());

    }

}
