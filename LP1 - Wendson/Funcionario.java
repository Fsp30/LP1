public class Funcionario {
    private String nome;
    private String cargo;
    private float salario;
    private String departamento;

    public Funcionario(String nome, String cargo, float salario, String depto) {
        setNome(nome);
        setCargo(cargo);
        setSalario(salario);
        setDepartamento(depto);
    }

    public void setNome(String nome) {
        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("O nome não pode ser vazio");
        }
        this.nome = nome;
    }

    public void setCargo(String cargo) {
        if (cargo == null || cargo.trim().isEmpty()) {
            throw new IllegalArgumentException("O cargo não pode ser vazio");
        }
        this.cargo = cargo;
    }

    public void setSalario(float salario) {
        if (salario <= 0.0f) {
            throw new IllegalArgumentException("O salario deve ser maior que zero");
        }
        this.salario = salario;
    }

    public void setDepartamento(String departamento) {
        if (departamento == null || departamento.trim().isEmpty()) {
            throw new IllegalArgumentException("O departamento não pode ser vazio");
        }
        this.departamento = departamento;
    }

    public String getNome() { 
        String resposta = ""; 
        resposta = this.nome; 
        return resposta; 
    }
    
    public String getCargo() { 
        String resposta = ""; 
        resposta = this.cargo; 
        return resposta; 
    }
    
    public float getSalario() { 
        float resposta = 0.0f; 
        resposta = this.salario; 
        return resposta; 
    }
    
    public String getDepartamento() { 
        String resposta = ""; 
        resposta = this.departamento; 
        return resposta; 
    }

    public void receber_aumento(float percentual) {
        if (percentual <= 0.0f) {
            throw new IllegalArgumentException("Percentual deve ser maior que zero");
        } else {
            this.salario = this.salario + percentual; 
        }
    }

    public void mudar_departamento(String novo_departamento) {
        if (novo_departamento == null || novo_departamento.trim().isEmpty()) {
            throw new IllegalArgumentException("Departamento não pode ser vazio");
        } else {
            this.departamento = novo_departamento;
        }
    }
}

