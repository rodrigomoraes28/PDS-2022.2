package Singleton;

public class Usuario {

  String nome;
  int idade;


  Usuario(String nome_ex , int idade_ex){
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
