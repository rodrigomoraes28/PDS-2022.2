package rodrigo;

public class Usuario {


  String name;
  int idade;

  public Usuario(String name_ex, int idade_ex){
    this.name = name_ex;
    this.idade = idade_ex;
  }

  public int getIdade() {
    return idade;
  }

  public String getName() {
    return name;
  }

  public void show(){
    System.out.println("Nome: " + this.name + "\n" + "Idade: "+ this.idade + "\n" );
  }
  
}
