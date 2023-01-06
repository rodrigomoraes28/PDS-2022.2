package Iterator;

public class Paciente {


  String nome;
  int idade;

  Paciente(String nome_ex, int idade_ex){
    this.nome = nome_ex;
    this.idade = idade_ex;
  }

  public int getIdade() {
    return idade;
  }
  
  public String getNome() {
    return nome;
  }
  
}
