public class Usuario{

  String nome;
  int idade;

  Usuario(String nome_ex, int idade_ex){
    this.nome = nome_ex;
    this.idade = idade_ex;
  }

  public void show(){
    System.out.println("Meu nome é : " + this.nome + ", e minha idade é : " + this.idade);
  }


  public int getIdade() {
    return idade;
  }

  public String getNome() {
    return nome;
  }
  

}