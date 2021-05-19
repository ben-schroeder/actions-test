package eu.benschroeder.actionstestbackend.controller;

import eu.benschroeder.test.junit5.UnitTest;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;

class HelloControllerTest extends UnitTest {

    @InjectMocks
    private HelloController helloController;

    @Test
    void testSayHello() {

        final String hello = helloController.sayHello();

        thenAssert(hello).isEqualTo("Hello");

    }

}