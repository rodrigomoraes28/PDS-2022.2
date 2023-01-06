public class Produto {

  String nome;
  float preco;
  float peso;


  public Produto(String nome, float preco, float peso){
    this.nome = nome;
    this.preco = preco;
    this.peso = peso;
  }


  public String getNome() {
    return nome;
  }

  public float getPeso() {
    return peso;
  }

  public float getPreco() {
    return preco;
  }
  
  
}
