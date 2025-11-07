public class  Livro {

    //private: só quem pode modificar é a classe Livro
    private String titulo;
    private String autor;

    public Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    //getter para o titulo
    public String getTiluto() {
        return this.titulo;
    }

    //getter para autor
    public String getAutor() {
        return this.autor;
    }

}