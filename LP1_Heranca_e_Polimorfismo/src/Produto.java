package if_oo_20261_heranca;

public abstract class Produto {
    
    protected String nome;
    protected float precoBase;

    public void setNome(String nome) {
        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("O nome do produto nao pode ser vazio");
        } else {
            this.nome = nome;
        }
    }

    public void setPrecoBase(float precoBase) {
        if (precoBase < 0.0f) {
            throw new IllegalArgumentException("O preco base nao pode ser negativo");
        } else {
            this.precoBase = precoBase;
        }
    }

    public String getNome() {
        String resposta = "";
        resposta = this.nome;
        return resposta;
    }

    public float getPrecoBase() {
        float resposta = 0.0f;
        resposta = this.precoBase;
        return resposta;
    }

    public abstract float calcularPreco();
}
