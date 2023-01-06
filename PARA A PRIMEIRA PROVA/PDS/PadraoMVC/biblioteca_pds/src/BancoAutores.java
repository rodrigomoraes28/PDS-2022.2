import java.util.ArrayList;

public class BancoAutores {
        private ArrayList<Autor> autores;
    
        public BancoAutores(){
            this.autores = new ArrayList<Autor>();
        }
        public void cadastrarAutor(Autor autor){
            autores.add(autor);
        }
    
        ArrayList<Autor> getAutores(){
            return this.autores;
        }
}
