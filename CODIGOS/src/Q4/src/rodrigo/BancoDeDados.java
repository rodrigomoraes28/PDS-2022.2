package rodrigo;

import java.util.ArrayList;

public class BancoDeDados {


  private ArrayList<Usuario> usuario = new ArrayList<Usuario>();;
  private static BancoDeDados uniqueStance;

  private BancoDeDados(){
  }


  public static BancoDeDados getInstance(){
    if(uniqueStance == null){
      uniqueStance = new BancoDeDados();
    }
    return uniqueStance;
  }


  public void addUsuario(Usuario user){
      this.usuario.add(user);
  }

  public void showAll(){
    for (Usuario usuario2 : usuario) {
      usuario2.show();
    }
  }



  
}
