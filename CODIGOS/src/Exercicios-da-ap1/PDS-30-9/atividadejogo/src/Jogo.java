public class Jogo {
    public static void main(String[] args) throws Exception {
        
        Jogo jogo = new Jogo();
        jogo.iniciar();

    }

    public void iniciar(){
        Espada espada = new Espada();
        Machado machado = new Machado();
        //  System.out.println("dano da espada:" + espada.ataque());
        // System.out.println("dano da machado:" + machado.ataque());

        Jogador1 jogador1 = new Jogador1(100, machado );
        //System.out.println("Jogador vida: " + jogador1.getVida() + " " + jogador1.getArma());

        jogador1.trocaArma(espada);
        jogador1.usarArma();
    }
}
