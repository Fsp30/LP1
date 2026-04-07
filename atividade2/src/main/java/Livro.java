public class Livro {
    private String titulo;
    private String autor;
    private int anoPublicacao;
    private int numeroPaginas;
    private String genero;
    private boolean estado;
    private int paginaMarcada;
    private int paginaAtual;


    public void setTitulo(String titulo){
        if(titulo.trim().isEmpty()){
            throw new IllegalArgumentException("O titulo não pode estar vazio");
        }
        this.titulo = titulo;
    }

    public void setAutor(String autor){
        if(autor.trim().isEmpty()){
            throw new IllegalArgumentException("O nome do autor não pode estar vazio");
        }
        this.autor = autor;
    }

    public void setAnoPublicacao(int ano){
        if(ano < -5000){
            throw new IllegalArgumentException("O ano de publicação não pode ser anterior a 5000 A.C");
        }
        if(ano > 2027 ){
            throw new IllegalArgumentException("O ano de publicação do livro não pode ser posterior à de 2027");
        }
        this.anoPublicacao = ano;
    }

    public void setGenero(String genero){
        if(genero.trim().isEmpty()){
            throw new IllegalArgumentException("O genêro do livro não pode estar vazio");
        }
        this.genero = genero;
    }

    public void setNumeroPaginas(int numeroPaginas){
        if(numeroPaginas < 1){
            throw new IllegalArgumentException("O livro deve ter ao menos uma página");
        }
        this.numeroPaginas = numeroPaginas;
    }

    public void setEstado(boolean estado){
        if(this.estado == estado){
            throw new IllegalArgumentException("O estado do livro deve estar difenrente para tal ação (aberto ou fechado)");
        }
        this.estado = estado;
    }

    public void setPaginaAtual(int paginaAtual){
        if(paginaAtual < 1){
            throw new IllegalArgumentException("Não se pode estar numa pagina anterior a pagina 1");
        }
        if(paginaAtual > this.numeroPaginas){
            throw new IllegalArgumentException("Não se pode estar numa pagina posterior ao número de paginas do livro");
        }
        this.paginaAtual = paginaAtual;
    }



    public String getTitulo(){ return this.titulo; }
    public String getAutor(){ return this.autor; }
    public int getAnoPublicacao(){ return this.anoPublicacao; }
    public String getGenero(){ return this.genero; }
    public int getNumeroPaginas(){ return this.numeroPaginas; }
    public boolean getEstado(){ return this.estado; }
    public int getPaginaMarcada(){ return this.paginaMarcada; }
    public int getPaginaAtual(){ return this.paginaAtual; }

    public String abrir(){
        this.setEstado(true);
        return "O livro foi aberto";
    }

    public String fechado(){
        this.setEstado(false);
        return "O livro foi fechado";
    }

    public void marcaPagina(){
        this.paginaMarcada = this.getPaginaAtual();
    }

    public void avancarPagina(){
        if(this.paginaAtual + 1 > this.numeroPaginas){
            throw new IllegalArgumentException("Voce já está no fim do livro");
        }
        this.paginaAtual += 1;
    }

    public void retrocederPagina(){
        if(this.paginaAtual == 1){
            throw new IllegalArgumentException("O livro já está na pagina 1, não se pode retroceder");
        }

        this.paginaAtual -= 1;
    }






}

