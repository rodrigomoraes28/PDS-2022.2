import java.util.ArrayList;

public class Tribo {
	private ArrayList<Animal> animais; 
	private ArrayList<Indio> indios; 
	private Indio cacique;
	public Tribo() { 
		animais = new ArrayList<Animal>(); 
	} 
	public void adicionaAnimal(Animal animal) { 
		animais.add(animal); 
	} 
	public int getNumPatas() { 
		int result = 0; 
		for(Animal a : animais){
			result += a.getNumPatas();
		}
		return result; 
	} 
	public ArrayList<Animal> getAnimais() { 
		return animais; 
	} 
	public void setAnimais(ArrayList<Animal> 
	animais) { 
		this.animais = animais; 
	} 
	public void removeAnimal(Animal animal) { 
		this.animais.remove(animal); 
	} 
	public void addIndio(Indio indio) { 
		this.indios.add(indio); 
	} 
	// public void setCacique(Cacique cacique) { 
	// 	this.cacique = cacique; 
	// } 
	// public Cacique getCacique() { 
	// 	return this.cacique; 
	// } 
}
