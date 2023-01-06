package sacoDeBombom;

public class SacoMedio extends SacoDeBombom{

    public SacoMedio(String marca){
        super.marca = marca;
    }
    @Override
    public int getQtd() {
        return 25;
    }

}
