import org.example.AnalisadorDigitos;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AnalisadorDigitosTest {

    private AnalisadorDigitos analisadorDigitos;

    @BeforeEach
    public void setUp() {
        analisadorDigitos = new AnalisadorDigitos();
    }

    @Test
    public void testMediaDosDigitos() {
        assertEquals(0.0, analisadorDigitos.mediaDosDigitos(0), 0.001); // Teste com número zero
        assertEquals(5.0, analisadorDigitos.mediaDosDigitos(555), 0.001); // Todos os dígitos iguais
        assertEquals(2.5, analisadorDigitos.mediaDosDigitos(1234), 0.001); // Números sequenciais
        assertEquals(3.0, analisadorDigitos.mediaDosDigitos(111), 0.001); // Números repetidos
        assertEquals(4.0, analisadorDigitos.mediaDosDigitos(456789), 0.001); // Números aleatórios
    }
}
