public class Livro {
    private String titulo;
    private String autor;
    private int anoPublicacao;
    private int numeroPaginas;
    private String genero;
    private boolean aberto;
    private int paginaAtual;

    public Livro(String titulo, String autor, int ano, int paginas, String genero) {
        setTitulo(titulo);
        setAutor(autor);
        setAnoPublicacao(ano);
        setNumeroPaginas(paginas);
        setGenero(genero);
        this.paginaAtual = 1;
        this.aberto = false;
    }

    public void setTitulo(String titulo) {
        if (titulo == null || titulo.trim().isEmpty()) {
            throw new IllegalArgumentException("O titulo não pode ser vazio");
        }
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        if (autor == null || autor.trim().isEmpty()) {
            throw new IllegalArgumentException("O autor não pode ser vazio");
        }
        this.autor = autor;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        if (anoPublicacao <= 0) {
            throw new IllegalArgumentException("O ano deve ser maior que zero");
        }
        this.anoPublicacao = anoPublicacao;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        if (numeroPaginas <= 0) {
            throw new IllegalArgumentException("Paginas devem ser maiores que zero");
        }
        this.numeroPaginas = numeroPaginas;
    }

    public void setGenero(String genero) {
        if (genero == null || genero.trim().isEmpty()) {
            throw new IllegalArgumentException("O genero não pode ser vazio");
        }
        this.genero = genero;
    }
    
    public void setPaginaAtual(int paginaAtual) {
        this.paginaAtual = paginaAtual;
    }

    public String getTitulo() { 
        String resposta = ""; 
        resposta = this.titulo; 
        return resposta; 
    }
    
    public String getAutor() { 
        String resposta = ""; 
        resposta = this.autor; 
        return resposta; 
    }
    
    public int getAnoPublicacao() { 
        int resposta = 0; 
        resposta = this.anoPublicacao; 
        return resposta; 
    }
    
    public int getNumeroPaginas() { 
        int resposta = 0; 
        resposta = this.numeroPaginas; 
        return resposta; 
    }
    
    public String getGenero() { 
        String resposta = ""; 
        resposta = this.genero; 
        return resposta; 
    }
    
    public int getPaginaAtual() { 
        int resposta = 0; 
        resposta = this.paginaAtual; 
        return resposta; 
    }
    
    public boolean isAberto() { 
        boolean resposta = false; 
        resposta = this.aberto; 
        return resposta; 
    }

    // Retirado o println conforme orientação do professor
    public void abrir() {
        this.aberto = true;
    }

    public void fechar() {
        this.aberto = false;
    }

    public void marcar_pagina(int pagina) {
        if (pagina < 1) {
            throw new IllegalArgumentException("A pagina não pode ser menor que 1");
        } else {
            if (pagina > this.numeroPaginas) {
                throw new IllegalArgumentException("Pagina maior que o total");
            } else {
                this.paginaAtual = pagina;
            }
        }
    }

    public void avancar_pagina() {
        if (!this.aberto) {
            throw new IllegalStateException("O livro precisa estar aberto");
        } else {
            if (this.paginaAtual >= this.numeroPaginas) {
                throw new IllegalArgumentException("O livro ja esta na ultima pagina");
            } else {
                this.paginaAtual = this.paginaAtual + 1;
            }
        }
    }

    public void retroceder_pagina() {
        if (!this.aberto) {
            throw new IllegalStateException("O livro precisa estar aberto");
        } else {
            if (this.paginaAtual <= 1) {
                throw new IllegalArgumentException("Ja esta na primeira pagina");
            } else {
                this.paginaAtual = this.paginaAtual - 1;
            }
        }
    }
}

