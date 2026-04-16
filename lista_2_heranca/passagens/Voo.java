package lista_2_heranca.passagens;

public abstract class Voo {
    private String origem;
    private String destino;
    private float distancia;
    private String data;

    public Voo(String origem, String destino, float distancia, String data){
        setOrigem(origem);
        setDestino(destino);
        setDistancia(distancia);
        setData(data);
    }

    public void setOrigem(String origem){
        if(origem.trim().isEmpty()){
            throw new IllegalArgumentException("O local de origem não pode estar vazio");
        }
        this.origem = origem;
    }

    public void setDestino(String destino){
        if(destino.trim().isEmpty()){
            throw new IllegalArgumentException("O local de destino não pode estar vazio");
        }
        this.destino = destino;
    }

    public void setDistancia(float distancia){
        if(distancia < 0){
            throw new IllegalArgumentException("O valor da distancia não pode ser negativo");
        }
        this.distancia = distancia;
    }

    public void setData(String data){
        if(data.trim().isEmpty()){
            throw new IllegalArgumentException("A campo de data não pode estar vazio");
        }
        this.data = data;
    }

    public String getOrigem() {
        return origem;
    }

    public String getDestino() {
        return destino;
    }

    public float getDistancia() {
        return distancia;
    }

    public String getData() {
        return data;
    }

    public abstract float calcularPreco();


}
