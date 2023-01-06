package Singleton;

public class ExemplodeUso {


  public static void main(String[] args) {
    

    ExemplodeUso exemplodeUso = new ExemplodeUso();

    exemplodeUso.inicia();
  }


  public void inicia(){

    SingletonUsario db1 = SingletonUsario.getInstance();
    db1.addUsuario(new Usuario("Rodrigo", 20));
    db1.addUsuario(new Usuario("Vitor", 22));

    System.out.println(db1.show());


    SingletonUsario db2 = SingletonUsario.getInstance();
    db2.addUsuario(new Usuario("Larissa", 21));

    System.out.println(db1.show());

    System.out.println(db1 == db2);


  }
  
}
