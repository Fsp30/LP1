package if_oo_20261_heranca;

public class Retangulo extends FormaGeometrica {
    
    private double largura;
    private double altura;

    public Retangulo(double largura, double altura) {
        setLargura(largura);
        setAltura(altura);
    }

    public void setLargura(double largura) {
        if (largura <= 0.0) {
            throw new IllegalArgumentException("A largura deve ser maior que zero");
        } else {
            this.largura = largura;
        }
    }

    public void setAltura(double altura) {
        if (altura <= 0.0) {
            throw new IllegalArgumentException("A altura deve ser maior que zero");
        } else {
            this.altura = altura;
        }
    }

    public double getLargura() {
        double resposta = 0.0;
        resposta = this.largura;
        return resposta;
    }

    public double getAltura() {
        double resposta = 0.0;
        resposta = this.altura;
        return resposta;
    }

    @Override
    public double calcularArea() {
        double resposta = 0.0;
        resposta = this.largura * this.altura;
        return resposta;
    }

    @Override
    public double calcularPerimetro() {
        double resposta = 0.0;
        resposta = 2 * (this.largura + this.altura);
        return resposta;
    }
}
