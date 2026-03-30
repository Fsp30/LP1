public class IMC {
    private char genero;
    private float altura;
    private float peso;

    public void setGenero(char gen){
        gen = Character.toUpperCase(gen);
        if(gen != 'M' && gen != 'F'){
            throw new IllegalArgumentException("O genero deve ser masculino (M) ou feminino (F)");
        }
        this.genero = gen;
    }

    public void setAltura(float altura){
        if(altura < 0){
            throw new IllegalArgumentException("A altura não pode ser negativa");
        }
        this.altura = altura;
    }

    public void setPeso(float peso){
        if(peso <= 0){
            throw new IllegalArgumentException("O peso não pode ser menor ou igual a zero");
        }
        this.peso = peso;
    }

    public char getGenero(){return  this.genero; }
    public float getAltura(){ return  this.altura; }
    public float getPeso(){ return  this.peso; }

    public float calcularIMC(){
        return this.peso/(this.altura * this.altura);
    }

    public String MostrarResultado(){
        String resultado;
        float imc = this.calcularIMC();
        if(this.genero == 'F'){
            if(imc> 32.2f){
                resultado = "Obesa";
            }else{
                if(imc > 27.2f){
                    resultado = "Acima do peso Ideal";
                }else {
                    if(imc > 25.7f){
                        resultado = "Marginalmente acima do Peso";
                    }else{
                        if(imc > 19.0f){
                            resultado = "Peso normal";
                        }else{
                            resultado = "Abaixo do Peso";
                        }
                    }
                }
            }
        }else{
            if(imc > 31.0f){
                resultado = "Obeso";
            }else{
                if(imc > 27.6f){
                    resultado = "Acima do peso Ideal";
                }else {
                    if(imc > 26.3f){
                        resultado = "Marginalmente acima do Peso";
                    }else{
                        if(imc > 20.6f){
                            resultado = "Peso normal";
                        }else{
                            resultado = "Abaixo do Peso";
                        }
                    }
                }
            }
        }
        return resultado;
    }


}
