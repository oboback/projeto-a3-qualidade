import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SaudeAppTest {

    private final SaudeApp app = new SaudeApp();

    @Test
    public void testCadastroComSucesso() {
        boolean resultado = app.validarCadastroPaciente("Pedro Mendes", 22, "pedro@email.com");
        assertTrue(resultado);
    }

    @Test
    public void testErroNomeVazio() {
        assertThrows(IllegalArgumentException.class, () -> {
            app.validarCadastroPaciente("", 22, "pedro@email.com");
        });
    }

    @Test
    public void testIMCPesoNormal() {
        String resultado = app.calcularClassificacaoIMC(70.0, 1.75);
        assertEquals("Peso normal", resultado);
    }

    @Test
    public void testIMCObesidade() {
        String resultado = app.calcularClassificacaoIMC(100.0, 1.70);
        assertEquals("Obesidade", resultado);
    }

    @Test
    public void testIMCErroValoresNegativos() {
        assertThrows(IllegalArgumentException.class, () -> {
            app.calcularClassificacaoIMC(-60.0, 1.75);
        });
    }

    @Test
    public void testGlicoseNormal() {
        String resultado = app.analisarGlicose(90);
        assertEquals("Normal", resultado);
    }

    @Test
    public void testGlicoseDiabetes() {
        String resultado = app.analisarGlicose(130);
        assertEquals("Diabetes", resultado);
    }
}
