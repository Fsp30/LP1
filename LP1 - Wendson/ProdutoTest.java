import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ProdutoTest {
    
    Produto produto;

    @BeforeEach
    public void setUp() {
        produto = new Produto("Teclado Mecanico", 100.0f, "Informatica");
        produto.setQuantidadeEstoque(10);
    }

    @Test
    public void deveAdicionarAoEstoque() {
        produto.adicionar_estoque(5);
        assertEquals(15, produto.getQuantidadeEstoque());
    }

    @Test
    public void deveAplicarDescontoCorretamente() {
        produto.aplicar_desconto(10.0f);
        assertEquals(90.0f, produto.getPreco());
    }
}

