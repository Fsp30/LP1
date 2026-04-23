package if_oo_20261_heranca;

public abstract class ProdutoLoja implements IProdutoLoja {
    
    protected String nome;
    protected float precoUnitario;
    protected float quantidadeEstoque;

    public void setNome(String nome) {
        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("O nome nao pode ser vazio");
        }
        this.nome = nome;
    }

    public void setPrecoUnitario(float precoUnitario) {
        if (precoUnitario <= 0.0f) {
            throw new IllegalArgumentException("O preco unitario deve ser maior que zero");
        }
        this.precoUnitario = precoUnitario;
    }

    public void setQuantidadeEstoque(float quantidadeEstoque) {
        if (quantidadeEstoque < 0.0f) {
            throw new IllegalArgumentException("O estoque nao pode ser negativo");
        }
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public String getNome() {
        String resposta = "";
        resposta = this.nome;
        return resposta;
    }

    public float getPrecoUnitario() {
        float resposta = 0.0f;
        resposta = this.precoUnitario;
        return resposta;
    }

    public float getQuantidadeEstoque() {
        float resposta = 0.0f;
        resposta = this.quantidadeEstoque;
        return resposta;
    }

    public String realizarVenda(float quantidadeComprada) {
        String resposta = "";
        float valorFinal = 0.0f;
        
        if (quantidadeComprada <= 0.0f) {
            throw new IllegalArgumentException("A quantidade comprada deve ser maior que zero");
        }
        if (quantidadeComprada > this.quantidadeEstoque) {
            throw new IllegalArgumentException("Estoque insuficiente"); 
        }
        
        valorFinal = this.calcularPreco(quantidadeComprada);
        
        this.quantidadeEstoque = this.quantidadeEstoque - quantidadeComprada;
        
        resposta = "Venda concluida! Total: R$ " + valorFinal + " | Estoque restante: " + this.quantidadeEstoque;
        return resposta;
    }
}
