import java.util.ArrayList;
import java.util.Iterator;

import animals.Animal;

public class Tribo {
	private ArrayList<Animal> animais; 
	private ArrayList<Indio> indios; 
	private Indio cacique; 

	public Tribo() { 
		animais = new ArrayList<Animal>(); 
	} 

	//pra veriificar se o cacique inserido é o mesmo da tribo
	public void adicionaAnimal(Animal animal, Indio cacique) { 

		if(!this.cacique.equals(cacique))
			System.out.println("error: The cacique provided isn't from this tribe!");
		
		else
			animais.add(animal); 
		
	} 

	//este método serve para troca, já que neste caso é redundante verificar verificar o cacique
	public void adicionaAnimal(Animal animal) { 

			animais.add(animal); 
		
	} 


	public boolean estouNestaTribo(Animal animal){ 
		
		boolean achou=false; 
		
		Iterator<Animal> it = animais.iterator(); 
		while ((it.hasNext()) && (!achou))
			if (it.next().equals(this))
				achou = true; 

		
		return achou; 
	} 


	// public int getNumPatas() { 
	// 	int result = 0; 
	// 	for (Animal a : animais) { 
	// 		if (a.getEspecie().equals("Pato")) { 
	// 			result += 2; 
	// 		} else if (a.getEspecie().equals("Cachorro")) { 
	// 			result += 4; 
	// 		} else { 
	// 			// ? 
	// 		} 
	// 	} 
	// 	return result; 
	// } 

	
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
	public ArrayList<Indio> getIndios() { 
		return indios; 
	} 
	public void setCacique(Indio cacique) { 
		this.cacique = cacique; 
	} 
	public Indio getCacique() { 
		return this.cacique; 
	} 
}
