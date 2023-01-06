public class Postagem {
    private String texto;
    private IRedeSocial rede;

    public Postagem(String texto){
        this.texto = texto;
    }

    public void conectarRedeSocial(IRedeSocial rede)
    {
        this.rede = rede;

        this.rede.conectar("teste","69");
    }

    public void postar(IRedeSocial rede)
    {
        this.rede = rede;
        this.rede.postar(this.texto);
    }


}
