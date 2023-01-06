package animals;

public class Animal {
	private String nome; 
	private String especie; 
	private int patas;

	public Animal(String aEspecie, String aNome) 
	{  
		especie = aEspecie; 
		nome = aNome; 
		
	} 
 

	public String getEspecie() { 
		return especie; 
	} 
	public String getNome() { 
		return nome; 
	} 
	public void setNome(String nome) { 
		this.nome = nome; 
	}  

	public boolean equals(Object obj){ 
		Animal a = (Animal) obj; 
		if  
		((this.nome.equalsIgnoreCase(a.nome)) && 
				(this
						.especie.equalsIgnoreCase(a.especie))){ 
			return true; 
		} 
		return false; 
	} 
}
