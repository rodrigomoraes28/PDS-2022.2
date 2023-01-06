public class User {

  String name;
  int age;


  public User(String nome, int idade){
    this.name = nome;
    this.age = idade;
  }

  public int getAge() {
    return age;
  }

  public String getName() {
    return name;
  }

  // public void show(){
  //   System.out.println("Meu nome é: " + this.name + "e minha idade é : " +this.age);
  // }
  
}
