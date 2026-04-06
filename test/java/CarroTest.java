
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarroTest {

    Carro carro;

    @BeforeEach
    public void setUp() {
        carro = new Carro();
        carro.setVelocidadeAtual(100f);
        carro.setEstado(true);
    }

    @Test
    public void deveAcelerarCarro() {
        carro.acelerar(20f);
        assertEquals(120f, carro.getVelocidadeAtual());
    }

    @Test
    public void deveTentarAcelerarCarroDesligado() {
        try{
            carro.setEstado(false);
            carro.acelerar(20f);
            fail();
        }catch (IllegalArgumentException e){
            assertEquals("O carro deve estar ligado para acelerar", e.getMessage());
        }
    }

    @Test
    public void deveTentarAcelerarUmaVelocidadeNegativa(){
        try{
            carro.acelerar(-1f);
            fail();
        } catch (IllegalArgumentException e){
            assertEquals("O carro deve acelerar um valor positivo acima de zero", e.getMessage());
        }
    }

    @Test
    public void deveTentarAcelerarUmaVelocidadeIgualAZero(){
        try{
            carro.acelerar(0f);
            fail();
        } catch (IllegalArgumentException e){
            assertEquals("O carro deve acelerar um valor positivo acima de zero", e.getMessage());
        }
    }



    @Test
    public void deveFrearCarro(){
        carro.frear(20f);
        assertEquals(80f, carro.getVelocidadeAtual());
    }

    @Test
    public void deveTentarFreiarOCarroDesligado(){
        try{
            carro.setEstado(false);
            carro.frear(50f);
            fail();
        }catch (IllegalArgumentException e){
            assertEquals("O carro deve estar ligado para desacelerar", e.getMessage());
        }
    }

    @Test
    public void deveTentarFrearUmaVelocidadeNegativa(){
        try{
            carro.frear(-1f);
            fail();
        } catch (IllegalArgumentException e){
            assertEquals("O carro deve desacelerar um valor positivo acima de zero", e.getMessage());
        }
    }

    @Test
    public void deveTentarFrearUmaVelocidadeIgualAZero(){
        try{
            carro.frear(0f);
            fail();
        } catch (IllegalArgumentException e){
            assertEquals("O carro deve desacelerar um valor positivo acima de zero", e.getMessage());
        }
    }

    @Test
    public void deveFrearUmaVelocidadeMaiorDoQueAVelocidadeAtual(){
        carro.frear(120f);
        assertEquals(0f, carro.getVelocidadeAtual());
    }


    @Test
    public void deveLigarOCarro(){
        carro.setEstado(false);
        carro.setVelocidadeAtual(0f);
        carro.ligarCarro();
        assertEquals(true, carro.getEstado());
    }

    @Test
    public void deveTentarLigarOCarroAndando(){
        try{
            carro.ligarCarro();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Não se pode ligar o carro andando", e.getMessage());
        }
    }

    @Test
    public void deveTentarLigarOCarroJaLigado(){
        try{
            carro.setVelocidadeAtual(0f);
            carro.ligarCarro();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("A ação deve inverter o estado do carro (ligado ou desligado)", e.getMessage());
        }
    }

    @Test
    public void deveDesligarCarro(){
        carro.setVelocidadeAtual(0f);
        carro.desligarCarro();
        assertEquals(false, carro.getEstado());
    }

    @Test
    public void deveTentarDesligarOCarroAndando(){
        try{
            carro.desligarCarro();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Não se pode desligar o carro andando", e.getMessage());
        }
    }

    @Test
    public void deveTentarDesligarOCarroJaDesligado(){
        try{
            carro.setVelocidadeAtual(0f);
            carro.setEstado(false);
            carro.desligarCarro();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("A ação deve inverter o estado do carro (ligado ou desligado)", e.getMessage());
        }
    }


    @Test
    public void deveVerificarVelocidadeNegativa() {
        try {
            carro.acelerar(-1);
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Velocidade invalida", e.getMessage());
        }

    }

}