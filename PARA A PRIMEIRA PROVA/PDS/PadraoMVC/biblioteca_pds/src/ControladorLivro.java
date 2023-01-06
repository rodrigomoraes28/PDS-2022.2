import java.util.ArrayList;

public class ControladorLivro {
    private BancoLivros bancoLivros;
    
    public ControladorLivro(){
        this.bancoLivros = new BancoLivros();
    }

    public void cadastrarLivro(String codLivro, String titulo, String autor){
        Livro livro = new Livro(codLivro, titulo, autor);

        this.bancoLivros.cadastrarLivro(livro);
    }

    public ArrayList<Livro> buscarLivros(){
        return this.bancoLivros.getLivros();
    }
}
