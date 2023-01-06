import java.util.ArrayList;

public class ExemplodeUso{

  public static void main(String[] args) {
    ExemplodeUso exemplodeUso = new ExemplodeUso();
    exemplodeUso.inicia();
  }

  public void inicia(){

    // ArrayList<Usuario> user1 = new ArrayList<>();
    
    
    user1.add(new Usuario("Rodrigo", 20));
    user1.add(new Usuario("Tito", 19));

    // ArrayList<Usuario> user2 = new ArrayList<>();

    user2.add(new Usuario("Alex", 17));
    user2.add(new Usuario("Dan", 20));

    DAOSingleton dao1 = DAOSingleton.getInstance();
    DAOSingleton dao2 = DAOSingleton.getInstance();

    dao1.addUsuarios(user1);
    dao2.addUsuarios(user2);

    System.out.println(dao1);


  }
}