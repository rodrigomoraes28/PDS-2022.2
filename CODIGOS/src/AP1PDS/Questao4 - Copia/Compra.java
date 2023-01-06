import java.util.ArrayList;

public class Compra {

    private ArrayList<SacoDeBombom> sacosDeBombons;

    public Compra() {
        sacosDeBombons = new ArrayList< SacoDeBombom >();
    }

    public int contaQuantidadeBombons () {
        int bombons = 0;
        for (SacoDeBombom sb: sacosDeBombons)
            bombons += sb.getQtd();

        return bombons;
    }

    public void adicionaSacoBombom(SacoDeBombom sacosDeBombom){
        this.sacosDeBombons.add(sacosDeBombom);
    }


}
