package lista_2_heranca.gerenciamento_produtos;
public abstract class Produtos {
    private String nome;
    private float precoUnitario;
    private float quantidadeEstoque;

    public Produtos(String nome, float precoUnitario, float quantidadeEstoque){
        setNome(nome);
        setPrecoUnitario(precoUnitario);
        setQuantidadeEstoque(quantidadeEstoque);
    }

    public void setNome(String nome) {
        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("O nome do produto não pode estar vazio");
        }
        this.nome = nome;
    }

    public void setPrecoUnitario(float precoUnitario){
        if(precoUnitario <= 0){
            throw new IllegalArgumentException("O valor do produto deve ser maior que zero");
        }
        this.precoUnitario = precoUnitario;
    }

    public void setQuantidadeEstoque(float quantidadeEstoque){
        if(quantidadeEstoque < 0){
            throw new IllegalArgumentException("A quantidade no estoque não pode ser negativa");
        }
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public String getNome() { return this.nome; }
    public float getPrecoUnitario() { return this.precoUnitario; }
    public float getQuantidadeEstoque() { return this.quantidadeEstoque; }

    public abstract float calcularPreco(float quantidadeComprada);

    public void atualizarEstoque(float quantidadeComprada){
        if(quantidadeComprada <= 0){
            throw new IllegalArgumentException("A quantidade comprada deve ser maior que zero");
        }
        if(this.quantidadeEstoque < quantidadeComprada){
            throw new IllegalArgumentException("Estoque insuficiente. Disponível: " + this.quantidadeEstoque);
        }
        this.setQuantidadeEstoque(this.quantidadeEstoque - quantidadeComprada);
    }
}


