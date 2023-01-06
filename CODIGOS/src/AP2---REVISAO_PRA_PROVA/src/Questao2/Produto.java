package Questao2;

public class Produto {


  float peso;
  String nome;

  Produto(float peso_ex, String nome_ex){
    this.peso = peso_ex;
    this.nome = nome_ex;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public void setPeso(float peso) {
    this.peso = peso;
  }

  public String getNome() {
    return nome;
  }
  
  public float getPeso() {
    return peso;
  }
  
}
