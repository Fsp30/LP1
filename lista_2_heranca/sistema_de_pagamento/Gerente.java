package lista_2_heranca.sistema_de_pagamento;

public class Gerente extends Funcionario{
    private float bonus;

    public Gerente(float bonus){
        setBonus(bonus);
    }

    public void setBonus(float bonus){
        if(bonus < 0){
            throw new IllegalArgumentException("O valor do bonus não pode ser negativo");
        }
        this.bonus = bonus;
    }

    public float getBonus(){ return this.bonus; }

    @Override
    public float calcularPagamento() {
        return this.salarioBase + this.bonus;
    }
}
