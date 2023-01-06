package jogador;

import arma.Iarma;

public class Mago implements Ijogador{

    private Iarma arma;

    @Override
    public void Atacar(Iarma arma){
        this.arma = arma;

        //esse sout tá aqui apenas para testes, normalmente ao invés do sout estaria arma.usar()
        System.out.println("Seu dano foi: " + Integer.toString(arma.usar()));
    }


}
