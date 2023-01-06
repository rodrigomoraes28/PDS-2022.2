import java.util.ArrayList;

public class my_database_classic{

  private ArrayList<User> users = new ArrayList<User>();

 
  private static my_database_classic uniqueInstance;

  private my_database_classic(){}

  public static my_database_classic getInstance(){
    if(uniqueInstance == null){
      uniqueInstance = new my_database_classic();
    }
    return uniqueInstance;
  }  
  
  public void addUsuario(User usuario){
    this.users.add(usuario);
  }

  public void removeUsuario(User usuario){
    this.users.remove(usuario);
  }

  public void mostrar(){
    for (User iUser : users) {
       System.out.println(iUser.getName() + " , " + iUser.getAge());
    }
  }

  /**
   * 
   * 
   * so funcionaria se o nome da classe for Singleton tb, ae o Singleton eh um exemplo de caso de uso mas o nome da classe pode ser qlqr coisa, oq importa é o private static mesmo e o public static getInstance
   * 
  private static Singleton uniqueInstance = new Singleton();


  private Singleton(){

  }

  public static Singleton getInstance(){
    return uniqueInstance;
  }

 */
}