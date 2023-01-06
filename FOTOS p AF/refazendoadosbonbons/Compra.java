
import java.util.ArrayList;
public class Compra {
	private ArrayList<SacodeBombom> sacosDeBombons;
	
	public Compra() {
		sacosDeBombons = new ArrayList< SacodeBombom >();
	}
	
	public int contaQuantidadeBombons () {
		int bombons = 0;
    for (SacodeBombom sacodeBombom : sacosDeBombons) {
      bombons = bombons + sacodeBombom.quantidade();
    }
		return bombons;
	}
	
	public void adicionaSacoBombom(SacodeBombom sacosDeBombon){
		this.sacosDeBombons.add(sacosDeBombon);
	}
}

