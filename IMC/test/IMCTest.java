import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IMCTest {

    IMC imc;

    @BeforeEach
    public void setUp() {
        imc = new IMC();
        imc.setAltura(1.65f);
        imc.setPeso(60f);
    }

    @Test
    public void deveCalcularIMCAbaixoDoPesoFeminino() {
        imc.setGenero('F');
        imc.setPeso(45f);

        String resultado = imc.calcularIMC();

        assertEquals("Abaixo do Peso", resultado);
    }

    @Test
    public void deveCalcularIMCPesoNormalFeminino() {
        imc.setGenero('F');
        imc.setPeso(55f);

        String resultado = imc.calcularIMC();

        assertEquals("Peso normal", resultado);
    }

    @Test
    public void deveCalcularIMCMarginalmenteAcimaDoPesoFeminino() {
        imc.setGenero('F');
        imc.setPeso(72f);

        String resultado = imc.calcularIMC();

        assertEquals("Marginalmente acima do Peso", resultado);
    }

    @Test
    public void deveCalcularIMCAcimaDoPesoIdealFeminino() {
        imc.setGenero('F');
        imc.setPeso(78f);

        String resultado = imc.calcularIMC();

        assertEquals("Acima do peso Ideal", resultado);
    }

    @Test
    public void deveCalcularIMCObesaFeminino() {
        imc.setGenero('F');
        imc.setPeso(95f);

        String resultado = imc.calcularIMC();

        assertEquals("Obesa", resultado);
    }

    @Test
    public void deveCalcularIMCAbaixoDoPesoMasculino() {
        imc.setGenero('M');
        imc.setPeso(52f);
        String resultado = imc.calcularIMC();

        assertEquals("Abaixo do Peso", resultado);
    }

    @Test
    public void deveCalcularIMCPesoNormalMasculino() {
        imc.setGenero('M');
        imc.setPeso(70f);

        String resultado = imc.calcularIMC();

        assertEquals("Peso normal", resultado);
    }

    @Test
    public void deveCalcularIMCMarginalmenteAcimaDoPesoMasculino() {
        imc.setGenero('M');
        imc.setPeso(74f);

        String resultado = imc.calcularIMC();

        assertEquals("Marginalmente acima do Peso", resultado);
    }

    @Test
    public void deveCalcularIMCAcimaDoPesoIdealMasculino() {
        imc.setGenero('M');
        imc.setPeso(82f);

        String resultado = imc.calcularIMC();

        assertEquals("Acima do peso Ideal", resultado);
    }

    @Test
    public void deveCalcularIMCObesoMasculino() {
        imc.setGenero('M');
        imc.setPeso(92f);

        String resultado = imc.calcularIMC();

        assertEquals("Obeso", resultado);
    }

    @Test
    public void deveValidarGeneroInvalido() {
        try {
            imc.setGenero('X');
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("O genero deve ser masculino (M) ou feminino (F)", e.getMessage());
        }
    }

    @Test
    public void deveValidarAlturaNegativa() {
        try {
            imc.setAltura(-1.5f);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("A altura não pode ser negativa", e.getMessage());
        }
    }

    @Test
    public void deveValidarPesoNegativo() {
        try {
            imc.setPeso(-50f);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("O peso não pode ser negativo", e.getMessage());
        }
    }

    @Test
    public void deveAceitarAlturaZero() {
        imc.setAltura(0f);
        assertEquals(0f, imc.getAltura());
    }

    @Test
    public void deveAceitarPesoZero() {
        imc.setPeso(0f);
        assertEquals(0f, imc.getPeso());
    }

    @Test
    public void deveConverterGeneroMinusculoParaMaiusculo() {
        imc.setGenero('m');
        assertEquals('M', imc.getGenero());

        imc.setGenero('f');
        assertEquals('F', imc.getGenero());
    }
}