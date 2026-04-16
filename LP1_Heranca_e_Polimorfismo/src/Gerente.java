package if_oo_20261_heranca;

public class Gerente extends Funcionario {

    private float bonusFixo;

    public Gerente(float salarioMensal, float bonusFixo) {
        setSalarioMensal(salarioMensal);
        setBonusFixo(bonusFixo);
    }

    public void setBonusFixo(float bonusFixo) {
        if (bonusFixo < 0.0f) {
            throw new IllegalArgumentException("O bonus não pode ser negativo");
        } else {
            this.bonusFixo = bonusFixo;
        }
    }

    public float getBonusFixo() {
        float resposta = 0.0f;
        resposta = this.bonusFixo;
        return resposta;
    }

    @Override
    public float calcularPagamento() {
        float resposta = 0.0f;
        resposta = this.salarioMensal + this.bonusFixo;
        return resposta;
    }
}
