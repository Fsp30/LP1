package if_oo_20261_heranca;

public class Diretor extends Funcionario {

    private float lucrosEmpresa;
    private float percentualParticipacao; 

    public Diretor(float salarioMensal, float lucrosEmpresa, float percentualParticipacao) {
        setSalarioMensal(salarioMensal);
        setLucrosEmpresa(lucrosEmpresa);
        setPercentualParticipacao(percentualParticipacao);
    }

    public void setLucrosEmpresa(float lucrosEmpresa) {
        if (lucrosEmpresa < 0.0f) {
            throw new IllegalArgumentException("Os lucros não podem ser negativos");
        } else {
            this.lucrosEmpresa = lucrosEmpresa;
        }
    }

    public void setPercentualParticipacao(float percentualParticipacao) {
        if (percentualParticipacao < 0.0f) {
            throw new IllegalArgumentException("O percentual não pode ser negativo");
        } else {
            if (percentualParticipacao > 1.0f) {
                throw new IllegalArgumentException("O percentual não pode ser maior que 100% (1.0)");
            } else {
                this.percentualParticipacao = percentualParticipacao;
            }
        }
    }

    public float getLucrosEmpresa() {
        float resposta = 0.0f;
        resposta = this.lucrosEmpresa;
        return resposta;
    }

    public float getPercentualParticipacao() {
        float resposta = 0.0f;
        resposta = this.percentualParticipacao;
        return resposta;
    }

    @Override
    public float calcularPagamento() {
        float resposta = 0.0f;
        float participacao = 0.0f;
        
        participacao = this.lucrosEmpresa * this.percentualParticipacao;
        resposta = this.salarioMensal + participacao;
        
        return resposta;
    }
}
