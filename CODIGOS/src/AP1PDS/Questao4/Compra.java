import java.util.ArrayList;
public class Compra implements Ibombons {


	
	private ArrayList<SacoDeBombom> sacosDeBombons;
	
	public Compra() {
		sacosDeBombons = new ArrayList< SacoDeBombom >();
	}
	
	 
	
	public void adicionaSacoBombom(SacoDeBombom sacosDeBombon){
		this.sacosDeBombons.add(sacosDeBombons);
	}

  @Override
  public void contaQuantidadeBombons() {
     System.out.println(getQtd_bombons());
    
  }
}
