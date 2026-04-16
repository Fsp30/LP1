package lista_2_heranca.geometria;

public class Retangulo implements FormaGeometrica{
    private float base;
    private float altura;

    public void setAltura(float altura) {
        if(altura < 0){
            throw new IllegalArgumentException("O valor da altura não pode ser negativo");
        }
        this.altura = altura;
    }

    public void setBase(float base) {
        if(base < 0){
            throw new IllegalArgumentException("O valor da base não pode ser negativo");
        }
        this.base = base;
    }

    public float getAltura() {
        return altura;
    }

    public float getBase() {
        return base;
    }

    public float calcularArea() {
        return this.base * this.altura;
    }

    public float calcularPerimetro() {
        return 2 * (this.base + this.altura);
    }
}
