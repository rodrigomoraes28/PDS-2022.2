public class ExemplodeUso {

  public static void main(String[] args) {
    
    LojaDeAcessorios loja = new LojaDeAcessorios();

    Carregador carregador = new Carregador("Samsung J2 Carregador");
    Capa capa = new Capa("Samsung J7 Pro Capa");
    Pelicula pelicula = new Pelicula("J2 Prime pelicula");

    loja.adicionaAcessorio(pelicula);
    loja.adicionaAcessorio(carregador);
    loja.adicionaAcessorio(capa);


    System.out.println(loja.leValorTotal());


  }
  
}
