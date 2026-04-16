package if_oo_20261_heranca;

public class Circulo extends FormaGeometrica {
    
    private double raio;

    public Circulo(double raio) {
        setRaio(raio);
    }

    public void setRaio(double raio) {
        if (raio <= 0.0) {
            throw new IllegalArgumentException("O raio deve ser maior que zero");
        } else {
            this.raio = raio;
        }
    }

    public double getRaio() {
        double resposta = 0.0;
        resposta = this.raio;
        return resposta;
    }

    @Override
    public double calcularArea() {
        double pi = 3.14159;
        double resposta = 0.0;
        resposta = pi * (this.raio * this.raio);
        return resposta;
    }

    @Override
    public double calcularPerimetro() {
        double pi = 3.14159;
        double resposta = 0.0;
        resposta = 2 * pi * this.raio;
        return resposta;
    }
}
