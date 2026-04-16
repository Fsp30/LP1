package lista_2_heranca.passagens;

public class VooDomestico extends Voo{

    public VooDomestico(String origem, String destino, float distancia, String data){
        super(origem, destino, distancia, data);
    }

    public float calcularPreco() {
        return this.getDistancia() * this.fatorPreco();
    }

    public float fatorPreco(){
        return 1.25f;
    }

}
