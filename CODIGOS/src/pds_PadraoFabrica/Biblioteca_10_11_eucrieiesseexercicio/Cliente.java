public class Cliente {


  IFabricaLivro fabrica; // a classe cliente recebe a interface fabrica que é uma abstração (abstração pode ser tanto class abstract quanto interface , mas eh mais interessante ser interface)
  //a class abstract tem metodos com escopo (ou seja metodos com coisas escritas neles entre chaves e que retornam algo), mas nao podem ser instanciados (nao da pra dar um new na main por exemplo pra ele)
  //ja a interface os metodos nao tem escopo e ela tb eh uma abstração, essa é a grande diferença de classe abstrata e de interface e a interface tem metodos que podem ser implementados (implements) por outras classes, e,ou, interfaces, qualquer coisa , so precisa do implements Inomeinterfae (o I é so pra deixar claro q eh uma interface, mas tem q ser o nome mesmo da interface que ta no arquivo .java)

  //class abstract -> tem escopo , mas nao pode ser instanciada
  //interface -> nao tem escopo mas pode ser instanciada
  

  public Cliente(){
    fabrica = new FabricaEditoraA();
  }
   
  
  public ILivro criarLivro(String tipo){
      ILivro pizza = fabrica.criarLivro(tipo); 
      return pizza;
  }
  
}
