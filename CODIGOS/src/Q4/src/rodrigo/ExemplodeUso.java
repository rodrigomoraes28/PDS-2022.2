package rodrigo;

public class ExemplodeUso {
  
  public static void main(String[] args) {
    
    ExemplodeUso exemplodeUso = new ExemplodeUso();
    exemplodeUso.inicia();

  }

  public void inicia(){

    BancoDeDados db1 = BancoDeDados.getInstance();
    db1.addUsuario(new Usuario("Rodrigo", 20));
    db1.addUsuario(new Usuario("Alex", 17));
    db1.addUsuario(new Usuario("Dan", 19));
    
    db1.showAll();

    BancoDeDados db2 = BancoDeDados.getInstance();

    System.out.println(db1 == db2);


  }
}
