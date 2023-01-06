package Strategy;

public class Produto {


  String nome;
  float peso;

  Produto(String nome_ex, float peso_ex){
    this.nome = nome_ex;
    this.peso = peso_ex;
  }

  public String getNome() {
    return nome;
  }

  public float getPeso() {
    return peso;
  }
  
}
