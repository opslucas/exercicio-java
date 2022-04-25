package teste;

import dominio.Retangulo;
import static org.junit.jupiter.api.Assertions.*;

class RetanguloTest {

    @org.junit.jupiter.api.Test
    public void testCalcularArea() {
        Retangulo retangulo = new Retangulo(12, 5);
        assertEquals(60, retangulo.calcularArea(), 0);
    }

    @org.junit.jupiter.api.Test
    public void testaCalcularPerimetro() {
        Retangulo retangulo = new Retangulo(11, 7);
        assertEquals(36, retangulo.calcularPerimetro(), 0);
    }
}
