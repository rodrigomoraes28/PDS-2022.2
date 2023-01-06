import java.util.ArrayList;
import java.util.Scanner;

public class Interface {
    private ControladorLivro ControladorLivro;

    public Interface(){
        this.ControladorLivro = new ControladorLivro();
    }

    public void cadastrarLivro(Scanner sc){
        System.out.println("Codigo do livro: ");
        String codLivro = sc.nextLine();
        System.out.println("Titulo do livro: ");
        String titulo = sc.nextLine();
        System.out.println("Autor do livro: ");
        String autor = sc.nextLine();
                
        this.ControladorLivro.cadastrarLivro(codLivro, titulo, autor);
    }

    public void visualizarLivros(){
        ArrayList<Livro> livros = this.ControladorLivro.buscarLivros();
        
        System.out.println("=================================");
        for(Livro livro: livros){
            System.out.println(livro);
        }
        System.out.println("=================================");
    }
}
