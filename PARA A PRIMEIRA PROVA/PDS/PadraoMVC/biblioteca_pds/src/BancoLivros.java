import java.util.ArrayList;

public class BancoLivros {
    private ArrayList<Livro> livros;

    public BancoLivros(){
        this.livros = new ArrayList<Livro>();
    }
    public void cadastrarLivro(Livro livro){
        livros.add(livro);
    }

    ArrayList<Livro> getLivros(){
        return this.livros;
    }
}
