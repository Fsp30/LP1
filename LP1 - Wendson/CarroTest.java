import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CarroTest {

    Carro carro;

    @BeforeEach
    public void setUp() {
        carro = new Carro("Toyota", "Corolla", 2020);
    }

    @Test
    public void deveLigarOCarro() {
        carro.ligar();
        assertTrue(carro.getEstado());
    }

    @Test
    public void deveDesligarOCarroEZerarVelocidade() {
        carro.ligar();
        carro.acelerar(50.0f);
        carro.desligar();
        
        assertFalse(carro.getEstado());
        assertEquals(0.0f, carro.getVelocidadeAtual());
    }

    @Test
    public void deveAcelerarOCarroLigado() {
        carro.ligar();
        carro.acelerar(20.5f);
        assertEquals(20.5f, carro.getVelocidadeAtual());
    }

    @Test
    public void naoDeveAcelerarCarroDesligado() {
        try {
            carro.acelerar(10.0f);
            fail();
        } catch (IllegalStateException e) {
            assertEquals("O carro precisa estar ligado para acelerar", e.getMessage());
        }
    }

    @Test
    public void deveFrearSemDeixarVelocidadeNegativa() {
        carro.ligar();
        carro.acelerar(30.0f);
        carro.frear(40.0f); 
        
        assertEquals(0.0f, carro.getVelocidadeAtual());
    }
}

