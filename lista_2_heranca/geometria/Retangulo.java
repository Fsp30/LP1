package lista_2_heranca.geometria;

public class Retangulo extends FormaGeometrica{
    private float base;
    private float altura;

    public Retangulo(float base, float altura){
        setBase(base);
        setAltura(altura);
    }

    public float getBase() {
        return base;
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

    public void setAltura(float altura) {
        if(altura < 0){
            throw new IllegalArgumentException("O valor da altura não pode ser negativo");
        }
        this.altura = altura;
    }

    public float calcularArea() {
        return this.base * this.altura;
    }

    @Override
    public float calcularPerimetro() {
        return 2.0f * (this.base + this.altura);
    }
}
