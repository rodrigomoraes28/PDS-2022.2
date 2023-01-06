public class Facebook extends RedeSocial {

   // boolean conectado = false;

    @Override
    public void postar(String texto) {
        if (this.conectado)
            System.out.println("POSTAGEM FACEBOOK: "+ texto);
        else
            System.out.println("Conecte primeiro");
    }

    @Override
    public void conectar(String login, String senha) {
        //this.conectado = true;
        super.conectado = true;
     }

}
