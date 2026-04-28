package lista_2_heranca.sistema_de_pagamento;

public class Diretor extends Funcionario{
    private float lucrosEmpresa;
    private float porcentagemPartipacao;

    public Diretor(float lucrosEmpresa, float porcentagemPartipacao){
        setLucrosEmpresa(lucrosEmpresa);
        setPorcentagemPartipacao(porcentagemPartipacao);
    }

    public float getPorcentagemPartipacao() {
        return porcentagemPartipacao;
    }

    public void setPorcentagemPartipacao(float porcentagemPartipacao) {
        if(porcentagemPartipacao < 0){
            throw new IllegalArgumentException("O percentual de participação não pode ser negativo");
        }
        if(porcentagemPartipacao > 100){
            throw new IllegalArgumentException("O percentual de participação não pode ter valor excedente aos lucros da empresa");
        }
        this.porcentagemPartipacao = porcentagemPartipacao;
    }

    public float getLucrosEmpresa() {
        return lucrosEmpresa;
    }

    public void setLucrosEmpresa(float lucrosEmpresa) {
        this.lucrosEmpresa = lucrosEmpresa;
    }

    public float calcularBonusParticipacao(){
        float resultado;
        if(this.lucrosEmpresa < 0){
            resultado = 0;
        }else{
            resultado = this.lucrosEmpresa * this.porcentagemPartipacao;
        }
        return resultado;
    }

    public float calcularPagamento() {
        return this.salarioBase + calcularBonusParticipacao();
    }
}
