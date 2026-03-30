import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IMCTest {

    IMC imc;

    @BeforeEach
    public void setUp() {
        imc = new IMC();
        imc.setAltura(1.0f);
        imc.setPeso(60f);
    }

    @Test
    public void deveCalcularIMCFemininoAbaixoDoPesoLimiteMaximo(){
        imc.setGenero('F');
        imc.setPeso(19.0f);

        String resultado = imc.MostrarResultado();
        assertEquals("Abaixo do Peso", resultado);
    }

    @Test
    public void deveCalcularIMCFemininoNoPesoNormalLimiteMaximo(){
        imc.setGenero('F');
        imc.setPeso(25.7f);

        String resultado = imc.MostrarResultado();
        assertEquals("Peso normal", resultado);
    }

    @Test
    public void deveCalcularIMCFemininoMarginalmenteAcimaDoPesoLimiteMaximo(){
        imc.setGenero('F');
        imc.setPeso(27.2f);

        String resultado = imc.MostrarResultado();
        assertEquals("Marginalmente acima do Peso", resultado);
    }

    @Test
    public void deveCalcularIMCFemininoAcimaDoPesoIdealLimiteMaximo(){
        imc.setGenero('F');
        imc.setPeso(32.2f);

        String resultado = imc.MostrarResultado();
        assertEquals("Acima do peso Ideal", resultado);
    }

    @Test
    public void deveCalcularIMCFemininoObesaLimiteMinimo(){
        imc.setGenero('F');
        imc.setPeso(32.3f);

        String resultado = imc.MostrarResultado();
        assertEquals("Obesa", resultado);
    }

    @Test
    public void deveCalcularIMCMasculinoAbaixoDoPesoLimiteMaximo(){
        imc.setGenero('M');
        imc.setPeso(20.6f);

        String resultado = imc.MostrarResultado();
        assertEquals("Abaixo do Peso", resultado);
    }

    @Test
    public void deveCalcularIMCMasculinoNoPesoNormalLimiteMaximo(){
        imc.setGenero('M');
        imc.setPeso(26.3f);

        String resultado = imc.MostrarResultado();
        assertEquals("Peso normal", resultado);
    }

    @Test
    public void deveCalcularIMCMasculinoMarginalmenteAcimaDoPesoLimiteMaximo(){
        imc.setGenero('M');
        imc.setPeso(27.6f);

        String resultado = imc.MostrarResultado();
        assertEquals("Marginalmente acima do Peso", resultado);
    }

    @Test
    public void deveCalcularIMCMasculinoAcimaDoPesoIdealLimiteMaximo(){
        imc.setGenero('M');
        imc.setPeso(31.0f);

        String resultado = imc.MostrarResultado();
        assertEquals("Acima do peso Ideal", resultado);
    }

    @Test
    public void deveCalcularIMCMasculinoObesoLimiteMinimo(){
        imc.setGenero('M');
        imc.setPeso(31.1f);

        String resultado = imc.MostrarResultado();
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
            assertEquals("O peso não pode ser menor ou igual a zero", e.getMessage());
        }
    }

    @Test
    public void deveValidarPesoIgualAZero() {
        try {
            imc.setPeso(0f);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("O peso não pode ser menor ou igual a zero", e.getMessage());
        }
    }

    @Test
    public void deveAceitarAlturaZero() {
        imc.setAltura(0f);
        assertEquals(0f, imc.getAltura());
    }


    @Test
    public void deveConverterGeneroMinusculoParaMaiusculo() {
        imc.setGenero('m');
        assertEquals('M', imc.getGenero());

        imc.setGenero('f');
        assertEquals('F', imc.getGenero());
    }
}