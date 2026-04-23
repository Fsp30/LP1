package if_oo_20261_heranca;

public abstract class FormaGeometrica implements IFormaGeometrica {
    
    public String gerarRelatorio() {
        String resposta = "";
        double area = 0.0;
        double perimetro = 0.0;
        
        area = this.calcularArea();
        perimetro = this.calcularPerimetro();
        
        resposta = "Resultado -> Area: " + area + " | Perimetro: " + perimetro;
        return resposta;
    }
}
