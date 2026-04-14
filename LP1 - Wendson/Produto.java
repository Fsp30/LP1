public class Produto {
    private String nome;
    private float preco;
    private int quantidadeEstoque;
    private String categoria;

    public Produto(String nome, float preco, String categoria) {
        setNome(nome);
        setPreco(preco);
        setCategoria(categoria);
        this.quantidadeEstoque = 0;
    }

    public void setNome(String nome) {
        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("O nome não pode ser vazio");
        }
        this.nome = nome;
    }

    public void setPreco(float preco) {
        if (preco <= 0.0f) {
            throw new IllegalArgumentException("O preco deve ser maior que zero");
        }
        this.preco = preco;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        if (quantidadeEstoque < 0) {
            throw new IllegalArgumentException("Quantidade não pode ser negativa");
        }
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public void setCategoria(String categoria) {
        if (categoria == null || categoria.trim().isEmpty()) {
            throw new IllegalArgumentException("Categoria não pode ser vazia");
        }
        this.categoria = categoria;
    }

    public String getNome() { 
        String resposta = ""; 
        resposta = this.nome; 
        return resposta; 
    }
    
    public float getPreco() { 
        float resposta = 0.0f; 
        resposta = this.preco; 
        return resposta; 
    }
    
    public int getQuantidadeEstoque() { 
        int resposta = 0; 
        resposta = this.quantidadeEstoque; 
        return resposta; 
    }
    
    public String getCategoria() { 
        String resposta = ""; 
        resposta = this.categoria; 
        return resposta; 
    }

    public void adicionar_estoque(int quantidade) {
        if (quantidade <= 0) {
            throw new IllegalArgumentException("Quantidade deve ser maior que zero");
        } else {
            this.quantidadeEstoque = this.quantidadeEstoque + quantidade;
        }
    }

    public void remover_estoque(int quantidade) {
        if (quantidade <= 0) {
            throw new IllegalArgumentException("Quantidade deve ser maior que zero");
        } else {
            if (quantidade > this.quantidadeEstoque) {
                throw new IllegalArgumentException("Quantidade insuficiente");
            } else {
                this.quantidadeEstoque = this.quantidadeEstoque - quantidade;
            }
        }
    }

    public void aplicar_desconto(float percentual) {
        if (percentual <= 0.0f) {
            throw new IllegalArgumentException("Percentual deve ser maior que zero");
        } else {
            if (percentual > 100.0f) {
                throw new IllegalArgumentException("Desconto não pode ser maior que 100%");
            } else {
                float valorDesconto = this.preco * percentual; 
                this.preco = this.preco - valorDesconto;
            }
        }
    }
}

