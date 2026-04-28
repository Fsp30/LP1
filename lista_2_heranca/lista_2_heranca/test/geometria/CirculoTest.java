package lista_2_heranca.geometria;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CirculoTest {
    @Test
    void deveCalcularAreaCorretamente(){
        Circulo circulo = new Circulo(1.0f);
        assertEquals(3.14f, circulo.calcularArea());
    }

    @Test
    void deveCalcularPerimetroCorretamente(){
        Circulo circulo = new Circulo(1.0f);
        assertEquals(6.28f, circulo.calcularPerimetro());
    }

    @Test
    void deveRetornarRaio(){
        Circulo circulo = new Circulo(1.0f);
        assertEquals(1.0f, circulo.getRaio());
    }

    @Test
    void deveTentarColocarRaioNegativo(){
        try{
            Circulo circulo = new Circulo(-1.0f);
            fail();
        }catch(IllegalArgumentException e){
            assertEquals("O valor de raio não pode ser negativo", e.getMessage());
        }
    }
}