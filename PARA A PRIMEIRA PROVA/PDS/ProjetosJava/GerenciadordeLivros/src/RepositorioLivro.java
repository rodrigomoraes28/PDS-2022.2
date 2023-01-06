import java.util.ArrayList;

public class RepositorioLivro{

  ArrayList<Livro> livros;

  public RepositorioLivro(){
      livros = new ArrayList<>();
  }

  public boolean adicionarLivro(Livro livro){
      this.livros.add(livro); 
      return true;
  }


}