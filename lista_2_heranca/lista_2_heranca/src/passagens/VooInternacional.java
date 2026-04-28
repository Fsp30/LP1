package lista_2_heranca.passagens;

public class VooInternacional extends Voo{
    public VooInternacional(String origem, String destino, float distancia, String data){
        super(origem, destino, distancia, data);
    }

    public float calcularPreco() {
        return this.getDistancia() * this.fatorPreco() * this.conversaoDeMoeda();
    }

    public float fatorPreco(){
        return 1.30f;
    }

    public float conversaoDeMoeda(){
        return 1.45f;
    }
}
