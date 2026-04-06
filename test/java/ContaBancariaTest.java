
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ContaBancariaTest {
    ContaBancaria contaBancaria;

    @BeforeEach
    public void setUp() {
        contaBancaria = new ContaBancaria();
        contaBancaria.setNumeroConta(1234);
        contaBancaria.setSaldo(100f);
        contaBancaria.setTitular("João");
    }

    @Test
    public void deveDepositarDinheiroNaConta(){
        contaBancaria.depositar(50f);
        assertEquals(150f, contaBancaria.getSaldo());
    }

    @Test
    public void deveSacarDinheiroDaConta(){
        contaBancaria.sacar(10f);
        assertEquals(90f, contaBancaria.getSaldo());
    }

    @Test
    public void deveTentarDepositarValorNegativo(){
        try{
            contaBancaria.depositar(-0.1f);
            fail();
        }catch (IllegalArgumentException e) {
            assertEquals("É necessário depositar um valor maior que zero", e.getMessage());
        }
    }

    @Test
    public void deveTentarDepositarZero(){
        try{
            contaBancaria.depositar(0f);
            fail();
        }catch (IllegalArgumentException e) {
            assertEquals("É necessário depositar um valor maior que zero", e.getMessage());
        }
    }

    @Test
    public void deveTentarSacarMaisDoQueTemNaConta(){
        try{
            contaBancaria.sacar(100.1f);
            fail();
        }catch (IllegalArgumentException e){
            assertEquals("Para efetuar saque o valor da conta deve permancer positivo ou igual a zero, após o saque", e.getMessage());
        }
    }

    @Test
    public void deveZerarOValorNaConta(){
        contaBancaria.sacar(100f);
        assertEquals(0f, contaBancaria.getSaldo());
    }


}


