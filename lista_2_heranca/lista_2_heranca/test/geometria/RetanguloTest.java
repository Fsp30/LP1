package lista_2_heranca.geometria;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RetanguloTest {

    @Test
    void deveTentarSetarAlturaNegativa() {
        try{
            Retangulo retangulo = new Retangulo(1.0f,-1.0f);
            fail();
        }catch (IllegalArgumentException e){
            assertEquals("O valor da altura não pode ser negativo",e.getMessage());
        }
    }

    @Test
    void deveTentarSetarBaseNegativa() {
        try{
            Retangulo retangulo = new Retangulo(-1.0f,1.0f);
            fail();
        }catch (IllegalArgumentException e){
            assertEquals("O valor da base não pode ser negativo",e.getMessage());
        }
    }


    @Test
    void deveRetornarAltura() {
        Retangulo retangulo = new Retangulo(1.0f, 1.0f);
        assertEquals(1.0f, retangulo.getAltura());
    }

    @Test
    void deveRetornarBase() {
        Retangulo retangulo = new Retangulo(1.0f, 1.0f);
        assertEquals(1.0f, retangulo.getBase());
    }

    @Test
    void deveCalcularArea() {
        Retangulo retangulo = new Retangulo(2.0f, 3.0f);
        assertEquals(6.0f, retangulo.calcularArea());
    }

    @Test
    void deveCalcularPerimetro() {
        Retangulo retangulo = new Retangulo(2.0f, 5.0f);
        assertEquals(14.0f, retangulo.calcularPerimetro());
    }
}