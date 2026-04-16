package lista_2_heranca.geometria;

public class Circulo extends FormaGeometrica{
    private float raio;

    public void setRaio(float raio) {
        if(raio < 0){
            throw new IllegalArgumentException("O valor de raio não pode ser negativo");
        }
        this.raio = raio;
    }

    public float getRaio() {
        return raio;
    }

    public float calcularArea() {
        return (this.raio * this.raio) * 3.14f;
    }

    public float calcularPerimetro() {
        return 2 * 3.14f * this.raio;
    }
}