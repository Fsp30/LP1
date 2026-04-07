public class Produto {
    private String nome;
    private float preco;
    private int quantidadeEstoque;
    private String categoria;

    public void setNome(String nome){
        if(nome.trim().isEmpty()){
            throw new IllegalArgumentException("O produto deve ter um nome");
        }
        this.nome = nome;
    }

    public void setPreco(float preco){
        if(preco < 0){
            throw new IllegalArgumentException("O valor do produto não pode ser negativo");
        }
        this.preco = preco;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        if(quantidadeEstoque < 0){
            throw new IllegalArgumentException("A quantidade de itens não pode ser negativa");
        }
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public void setCategoria(String categoria) {
        if(categoria.trim().isEmpty()){
            throw new IllegalArgumentException("A gategoria do produto não pode estar vazia");
        }
        this.categoria = categoria;
    }

    public String getNome(){ return this.nome; }
    public float getPreco(){ return this.preco; }
    public int getQuantidadeEstoque(){ return this.quantidadeEstoque; }
    public String getCategoria(){ return this.categoria; }

    public void adicionarEstoque(int quantidade){
        if(quantidade < 1){
            throw new IllegalArgumentException("É necessário adicionar pelo menos uma unidade");
        }
        this.quantidadeEstoque += quantidade;
    }

    public void removerEstoque(int quantidade){
        if(quantidade > this.quantidadeEstoque){
            throw new IllegalArgumentException("A quantidade requerida de remoção excede a quantidade presente no estoque");
        }
        this.quantidadeEstoque -= quantidade;
    }

    public float calcularDesconto(int porcentagemDesconto){
        return this.preco * (porcentagemDesconto / 100f);
    }

    public float aplicarDesconto(int desconto){
        return this.preco - this.calcularDesconto(desconto);
    }
}
