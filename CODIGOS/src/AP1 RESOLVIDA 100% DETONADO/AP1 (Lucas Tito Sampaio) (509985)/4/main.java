import sacoDeBombom.SacoDeBombom;
import sacoDeBombom.SacoGrande;
import sacoDeBombom.SacoMedio;
import sacoDeBombom.SacoPequeno;

import java.util.ArrayList;

public class main {
    public static void main (String argas[]){


        Compra compra = new Compra();
        compra.adicionaSacoBombom(new SacoPequeno("Lolipop"));
        compra.adicionaSacoBombom(new SacoMedio("pipe"));
        compra.adicionaSacoBombom(new SacoGrande("Serenata"));

        System.out.println(compra.contaQuantidadeBombons());


    }

}
