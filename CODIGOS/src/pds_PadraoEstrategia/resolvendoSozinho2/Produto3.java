public class Produto3 {


  String nome;
  float preco;
  float peso;

  public Produto3(String nome, float preco, float peso){
    this.nome = nome;
    this.preco = preco;
    this.peso = peso;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public void setPeso(float peso) {
    this.peso = peso;
  }

  public void setPreco(float preco) {
    this.preco = preco;
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
