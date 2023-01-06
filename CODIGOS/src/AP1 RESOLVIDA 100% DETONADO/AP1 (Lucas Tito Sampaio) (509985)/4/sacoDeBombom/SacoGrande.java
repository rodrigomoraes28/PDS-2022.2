package sacoDeBombom;

public class SacoGrande extends SacoDeBombom{

    public SacoGrande(String marca){
        super.marca = marca;
    }

    @Override
    public int getQtd() {
        return 50;
    }

}
