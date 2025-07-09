package com.harold.inventario;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest
@ActiveProfiles("test") // ¡Añade esta anotación!
class InventarioApplicationTests {

    @Test
    void contextLoads() {
        // Test pasará con H2 en memoria
    }
}