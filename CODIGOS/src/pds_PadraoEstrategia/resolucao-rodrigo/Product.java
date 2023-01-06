public class Product {

  String nome;
  float peso;


  Product(String nome, float peso){
    this.nome = nome;
    this.peso = peso;
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
