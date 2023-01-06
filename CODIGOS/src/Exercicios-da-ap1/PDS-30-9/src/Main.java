public class Main {
    public static void main(String[] args) {

        Facebook face = new Facebook();
        Instagram insta = new Instagram();
        Postagem post = new Postagem("primeira postagem");
        //post.postar(face);
        post.conectarRedeSocial(face);
        post.postar(insta);
    }
}