package lista_2_heranca.pedidos;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProdutoEletronicoTest {

    @Test
    void deveRetornarPercentualDeDescontoDeProdutoEletronico() {
        ProdutoEletronico p = new ProdutoEletronico(1000f);
        assertEquals(0.90f, p.PercentualDeDesconto(), 0.001f);
    }

    @Test
    void deveCalcularPrecoComDescontoDeProdutoEletronico() {
        ProdutoEletronico p = new ProdutoEletronico(1000f);
        assertEquals(900f, p.calcularPreco(), 0.01f);
    }
}