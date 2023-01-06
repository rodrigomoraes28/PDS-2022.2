public class Instagram extends RedeSocial
{
    @Override
    public void postar(String texto) {
        if (super.conectado) //bolean
            System.out.println("POSTAGEM Insta: "+ texto);
        else
            System.out.println("Conecte primeiro");
    }

    @Override
    public void conectar(String login, String senha) {
        super.conectado = true;
    }
}
