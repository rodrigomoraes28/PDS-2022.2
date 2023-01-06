public class App {
  public static void main(String[] args) {
    

    Cliente cliente = new Cliente();
    System.out.println(cliente.criarLivro("terror"));

    System.out.println("\n"+cliente.criarLivro("acao"));

    System.out.println("\n"+cliente.criarLivro("misterio"));



    //FabricaEditoraA fabricaeditoraA = new FabricaEditoraA();

    //System.out.println(fabricaeditoraA.criarLivro("terror"));
  }
}
