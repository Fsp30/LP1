package lista_2_heranca.veiculos;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VeiculoTest {

    @Test
    void setMarca() {
    }

    @Test
    void setModelo() {
    }

    @Test
    void setPrecoBase() {
    }

    @Test
    void getMarca() {
    }

    @Test
    void getModelo() {
    }

    @Test
    void getPrecoBase() {
    }

    @Test
    void custoDoCarroDeveSerMaiorQueODaMotoComMesmoPrecoBase() {
        float preco = 10000f;
        Carro carro = new Carro("X", "X", preco);
        Moto moto = new Moto("X", "X", preco);
        assertTrue(carro.calcularCusto() > moto.calcularCusto());
    }

    @Test
    void custoDaMotoDeveSerMaiorQueODaBicicletaComMesmoPrecoBase() {
        float preco = 10000f;
        Moto moto = new Moto("X", "X", preco);
        Bicicleta bicicleta = new Bicicleta("X", "X", preco);
        assertTrue(moto.calcularCusto() > bicicleta.calcularCusto());
    }
}