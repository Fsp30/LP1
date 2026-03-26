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
    public void deveCalcularIMCPesoNormalMasculino() {
        imc.setGenero('M');
        imc.setPeso(70f);

        String resultado = imc.calcularIMC();

        assertEquals("Peso normal", resultado);
    }

    @Test
    public void deveCalcularIMCAbaixoDoPesoMasculino() {
        imc.setGenero('M');
        imc.setPeso(50f);

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
    public void deveCalcularIMCAbaixoDoPesoFeminino() {
        imc.setGenero('F');
        imc.setPeso(45f);

        String resultado = imc.calcularIMC();

        assertEquals("Abaixo do Peso", resultado);
    }

    @Test
    public void deveCalcularIMCAcimaDoPesoFeminino() {
        imc.setGenero('F');
        imc.setPeso(75f);

        String resultado = imc.calcularIMC();

        assertEquals("Acima do peso Ideal", resultado);
    }

    @Test
    public void deveCalcularIMCObesaFeminino() {
        imc.setGenero('F');
        imc.setPeso(90f);

        String resultado = imc.calcularIMC();

        assertEquals("Obesa", resultado);
    }

    @Test
    public void deveCalcularIMCMarginalAcimaDoPesoFeminino() {
        imc.setGenero('F');
        imc.setAltura(1.65f);

        imc.setPeso(72f);

        String resultado = imc.calcularIMC();

        assertEquals("Marginal acima do Peso", resultado);
    }

    @Test
    public void deveCalcularIMCMarginalAcimaDoPesoMasculino() {
        imc.setGenero('M');
        imc.setAltura(1.65f);

        imc.setPeso(74f);

        String resultado = imc.calcularIMC();

        assertEquals("Marginal acima do Peso", resultado);
    }

    @Test
    public void deveCalcularIMCAcimaDoPesoIdealMasculino() {
        imc.setGenero('M');
        imc.setAltura(1.65f);

        imc.setPeso(80f);

        String resultado = imc.calcularIMC();

        assertEquals("Acima do peso Ideal", resultado);
    }

    @Test
    public void deveCalcularIMCObesoMasculino() {
        imc.setGenero('M');
        imc.setAltura(1.65f);

        imc.setPeso(90f);

        String resultado = imc.calcularIMC();

        assertEquals("Obeso", resultado);
    }

    @Test
    public void deveCalcularIMCMarginalAcimaDoPesoFemininoLimiteInferior() {
        imc.setGenero('F');
        imc.setAltura(1.65f);

        float peso = 25.8f * (1.65f * 1.65f);
        imc.setPeso(peso);

        String resultado = imc.calcularIMC();

        assertEquals("Marginal acima do Peso", resultado);
    }

    @Test
    public void deveCalcularIMCMarginalAcimaDoPesoFemininoLimiteSuperior() {
        imc.setGenero('F');
        imc.setAltura(1.65f);

        float peso = 27.29f * (1.65f * 1.65f);
        imc.setPeso(peso);

        String resultado = imc.calcularIMC();

        assertEquals("Marginal acima do Peso", resultado);
    }

    @Test
    public void deveCalcularIMCAcimaDoPesoIdealFemininoLimiteInferior() {
        imc.setGenero('F');
        imc.setAltura(1.65f);

        float peso = 27.3f * (1.65f * 1.65f);
        imc.setPeso(peso);

        String resultado = imc.calcularIMC();

        assertEquals("Acima do peso Ideal", resultado);
    }

    @Test
    public void deveCalcularIMCAcimaDoPesoIdealFemininoLimiteSuperior() {
        imc.setGenero('F');
        imc.setAltura(1.65f);

        float peso = 32.29f * (1.65f * 1.65f);
        imc.setPeso(peso);

        String resultado = imc.calcularIMC();

        assertEquals("Acima do peso Ideal", resultado);
    }

    @Test
    public void deveCalcularIMCObesaFemininoLimiteInferior() {
        imc.setGenero('F');
        imc.setAltura(1.65f);

        float peso = 32.3f * (1.65f * 1.65f);
        imc.setPeso(peso);

        String resultado = imc.calcularIMC();

        assertEquals("Obesa", resultado);
    }

    @Test
    public void deveCalcularIMCPesoNormalMasculinoLimites() {
        imc.setGenero('M');
        imc.setAltura(1.65f);

        float pesoInferior = 20.7f * (1.65f * 1.65f);
        imc.setPeso(pesoInferior);

        String resultadoInferior = imc.calcularIMC();
        assertEquals("Peso normal", resultadoInferior);

        float pesoSuperior = 26.39f * (1.65f * 1.65f);
        imc.setPeso(pesoSuperior);

        String resultadoSuperior = imc.calcularIMC();
        assertEquals("Peso normal", resultadoSuperior);
    }

    @Test
    public void deveCalcularIMCAbaixoDoPesoMasculinoLimiteSuperior() {
        imc.setGenero('M');
        imc.setAltura(1.65f);

        float peso = 20.69f * (1.65f * 1.65f);
        imc.setPeso(peso);

        String resultado = imc.calcularIMC();

        assertEquals("Abaixo do Peso", resultado);
    }

    @Test
    public void deveCalcularIMCPesoNormalFemininoLimites() {
        imc.setGenero('F');
        imc.setAltura(1.65f);

        float pesoInferior = 19.1f * (1.65f * 1.65f);
        imc.setPeso(pesoInferior);

        String resultadoInferior = imc.calcularIMC();
        assertEquals("Peso normal", resultadoInferior);

        float pesoSuperior = 25.79f * (1.65f * 1.65f);
        imc.setPeso(pesoSuperior);

        String resultadoSuperior = imc.calcularIMC();
        assertEquals("Peso normal", resultadoSuperior);
    }

    @Test
    public void deveCalcularIMCAbaixoDoPesoFemininoLimiteSuperior() {
        imc.setGenero('F');
        imc.setAltura(1.65f);

        float peso = 19.09f * (1.65f * 1.65f);
        imc.setPeso(peso);

        String resultado = imc.calcularIMC();

        assertEquals("Abaixo do Peso", resultado);
    }

    @Test
    public void deveCalcularIMCMarginalAcimaDoPesoMasculinoLimiteInferior() {
        imc.setGenero('M');
        imc.setAltura(1.65f);

        float peso = 26.4f * (1.65f * 1.65f);
        imc.setPeso(peso);

        String resultado = imc.calcularIMC();

        assertEquals("Marginal acima do Peso", resultado);
    }

    @Test
    public void deveCalcularIMCAcimaDoPesoIdealMasculinoLimiteInferior() {
        imc.setGenero('M');
        imc.setAltura(1.65f);

        float peso = 27.8f * (1.65f * 1.65f);
        imc.setPeso(peso);

        String resultado = imc.calcularIMC();

        assertEquals("Acima do peso Ideal", resultado);
    }

    @Test
    public void deveCalcularIMCObesoMasculinoLimiteInferior() {
        imc.setGenero('M');
        imc.setAltura(1.65f);

        float peso = 31.1f * (1.65f * 1.65f);
        imc.setPeso(peso);

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
            imc.setAltura(-1);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("A altura não pode ser negativa", e.getMessage());
        }
    }

    @Test
    public void deveValidarPesoNegativo() {
        try {
            imc.setPeso(-10);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("O peso não pode ser negativo", e.getMessage());
        }
    }

    @Test
    public void deveAceitarGeneroMinusculo() {
        imc.setGenero('f');
        assertEquals('F', imc.getGenero());
    }
}