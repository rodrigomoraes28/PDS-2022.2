public class Livro {
    private String codLivro;
    private String titulo;
    private String autor;

    public Livro(String codLivro, String titulo, String autor){
        this.codLivro = codLivro;
        this.titulo = titulo;
        this.autor = autor;
    }

    public String toString(){
        return "Cod: " + this.codLivro + "; " + "Titulo: " + this.titulo + "; Autor: " + this.autor;
    }
}
