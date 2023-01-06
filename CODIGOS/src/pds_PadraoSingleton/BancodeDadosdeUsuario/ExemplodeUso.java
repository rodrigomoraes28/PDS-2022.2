public class ExemplodeUso {


  public static void main(String[] args) {
    
    ExemplodeUso exemploedUso = new ExemplodeUso();
    exemploedUso.inicia();
  }

  public void inicia(){

    // my_database_classic db1 = my_database_classic.getInstance();
    // my_database_classic db2 = my_database_classic.getInstance();

    // System.out.println(db1 == db2);


    my_database_classic banco = my_database_classic.getInstance();
    banco.addUsuario(new User("Luiz", 18));
    banco.addUsuario(new User("Rodrigo", 21));
    banco.addUsuario(new User("Vitor", 19));
    banco.mostrar();


    my_database_classic banco2 = my_database_classic.getInstance();
    banco2.addUsuario(new User("tito", 20));
    System.out.println(banco == banco2);
    banco.mostrar();


  }
  
}
