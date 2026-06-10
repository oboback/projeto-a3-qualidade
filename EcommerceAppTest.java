import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EcommerceAppTest {

    private final EcommerceApp loja = new EcommerceApp();

    @Test
    public void testFreteGratisPorValorAlto() {
        double frete = loja.calcularFrete(200, 300.0);
        assertEquals(0.0, frete);
    }

    @Test
    public void testFreteCurtaDistancia() {
        double frete = loja.calcularFrete(20, 100.0);
        assertEquals(15.00, frete);
    }

    @Test
    public void testErroValoresNegativos() {
        assertThrows(IllegalArgumentException.class, () -> {
            loja.calcularFrete(-10, 50.0);
        });
    }

    @Test
    public void testCupomPromoDezPorCento() {
        double valorFinal = loja.aplicarCupomDesconto(100.0, "PROMO10");
        assertEquals(90.0, valorFinal);
    }

    @Test
    public void testCupomVipComValorAlto() {
        double valorFinal = loja.aplicarCupomDesconto(250.0, "VIP30");
        assertEquals(175.0, valorFinal);
    }

    @Test
    public void testCupomVipComValorBaixo() {
        double valorFinal = loja.aplicarCupomDesconto(100.0, "VIP30");
        assertEquals(80.0, valorFinal);
    }

    @Test
    public void testCupomInvalidoMantemValor() {
        double valorFinal = loja.aplicarCupomDesconto(100.0, "CUPOM_FALSO");
        assertEquals(100.0, valorFinal);
    }
}
