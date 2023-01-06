public abstract class Produto {


  String nome;
  float preco;
  int peso;

  Produto(String nome_ex , float preco_ex, int peso_ex){
    this.nome = nome_ex;
    this.preco = preco_ex;
    this.peso = peso_ex;
  }

  public int getPeso() {
    return peso;
  }
  
}
