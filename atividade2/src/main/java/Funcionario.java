

public class Funcionario {
    private String nome;
    private String cargo;
    private float salario;
    private String departamento;

    public void setNome(String nome){
        if(nome.trim().isEmpty()){
            throw new IllegalArgumentException("O funcionário deve ter um nome");
        }
        this.nome = nome;
    }

    public void setCargo(String cargo){
        if(cargo.trim().isEmpty()){
            throw new IllegalArgumentException("O nome do cargo não pode estar vazio");
        }
        this.cargo = cargo;
    }

    public void setSalario(float salario){
        if(salario < 1500f){
            throw new IllegalArgumentException("O valor do salário não pode ser inferior ao salário minímo");
        }
        this.salario = salario;
    }

    public void setDepartamento(String departamento){
        if(departamento.trim().isEmpty()){
            throw new IllegalArgumentException("O nome do departamento não pode estar vazio");
        }
        this.departamento = departamento;
    }

    public String getNome() {
        return nome;
    }

    public float getSalario() {
        return salario;
    }

    public String getCargo() {
        return cargo;
    }

    public String getDepartamento() {
        return departamento;
    }

    public float calcularAumento(int percentual){
        return this.salario * (percentual / 100f);
    }

    public void receberAumento(int percentual){
        if(percentual < 1){
            throw new IllegalArgumentException("O percentual de aumento de salário deve ser ao minimo 1%");
        }
        this.salario += this.calcularAumento(percentual);
    }
/*
    public void mudarDepartamento(String novoDepartamento){
        if(Objects.equals(novoDepartamento, this.departamento)){
            throw new IllegalArgumentException("O departamento deve ser alterado");
        }
        this.setDepartamento(novoDepartamento);
    }
*/
    public void exibirDados(){
        System.out.println("Produto:\nNome: %s\nCargo: %s\nSalário: %f\nDepartamento: %s");
    }
}
