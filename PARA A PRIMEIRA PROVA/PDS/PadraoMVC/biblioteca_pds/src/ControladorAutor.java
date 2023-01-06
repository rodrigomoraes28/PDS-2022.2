public class ControladorAutor {
    private BancoAutores bancoAutores;

    public ControladorAutor(){
        this.bancoAutores = new BancoAutores();
    }

    public void cadastrarAutor(String nome){
        Autor autor = new Autor(nome);
        
        this.bancoAutores.cadastrarAutor(autor);
    }
}
