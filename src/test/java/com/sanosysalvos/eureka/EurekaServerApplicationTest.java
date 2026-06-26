package com.sanosysalvos.eureka;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(properties = {"eureka.client.enabled=false"})
class EurekaServerApplicationTest {

    @Test
    void contextoDeberiaCargar() {
    }
}
