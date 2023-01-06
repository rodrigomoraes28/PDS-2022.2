
import java.util.ArrayList;

public class Compra {

	private ArrayList<SacodeBombomGenerico> sacosDeBombons;
	
	public Compra() {
		sacosDeBombons = new ArrayList<SacodeBombomGenerico >();
	}
	
	public int contaQuantidadeBombons () {
		int bombons = 0;


    for (SacodeBombomGenerico sacoDeBombom : sacosDeBombons) {
      bombons += sacoDeBombom.getQtdBombons();
    }


    return bombons;
	 
	}
	
	public void adicionaSacoBombom(SacodeBombomGenerico sacosDeBombon){
		this.sacosDeBombons.add(sacosDeBombon);
	}
}

