package if_oo_20261_heranca;

public class ProdutoEletronico extends Produto {

    public ProdutoEletronico(String nome, float precoBase) {
        setNome(nome);
        setPrecoBase(precoBase);
    }

    @Override
    public float calcularPreco() {
        float resposta = 0.0f;
        float valorDesconto = 0.0f;
        
        valorDesconto = this.precoBase * 0.10f; 
        resposta = this.precoBase - valorDesconto;
        
        return resposta;
    }
}
