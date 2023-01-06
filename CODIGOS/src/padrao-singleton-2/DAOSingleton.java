import java.util.ArrayList;

public class DAOSingleton {


  private static DAOSingleton uniqueInstance;
  ArrayList<Usuario> user =  new ArrayList<Usuario>();

  private DAOSingleton(){}


  public static DAOSingleton getInstance(){
    if(uniqueInstance == null){
      return new DAOSingleton();
    }
    else{
      return uniqueInstance;
    }
  }


  public void addUsuarios(ArrayList<Usuario> usuario){
    this.user.addAll(usuario);
  }


  public String toString(){

    String string = "";
    for (Usuario usuario : user) {
      string += usuario.getNome()+ ", ";
    }
    return string;
  }

  
  
}
