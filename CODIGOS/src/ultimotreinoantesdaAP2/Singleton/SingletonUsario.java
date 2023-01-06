package Singleton;

import java.util.ArrayList;

public class SingletonUsario {



  private static SingletonUsario uniqueInsatance;

  ArrayList<Usuario> usuarios;


  private SingletonUsario(){}

  
  public static SingletonUsario getInstance(){
    if(uniqueInsatance == null){
      return new SingletonUsario();
    }
    else{
      return uniqueInsatance;
    }
  }


  public void addUsuario(Usuario user){
      this.usuarios.add(user);    
  }

  public String show(){

    String string_users = "";
    for (Usuario usuario : usuarios) {
      string_users += usuario.getNome() + ", " + usuario.getIdade();
    }

    return string_users;
  }
}
