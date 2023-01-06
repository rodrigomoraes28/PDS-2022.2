package sacoDeBombom;

public class SacoPequeno extends SacoDeBombom{

    public SacoPequeno(String marca){
        super.marca = marca;
    }

    @Override
    public int getQtd() {
        return 10;
    }
}
