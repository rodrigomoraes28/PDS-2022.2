public class FabricaEditoraA implements IFabricaLivro{

  @Override
  public ILivro criarLivro(String tipo){

    switch(tipo){
      case "terror":
        return new LivroTerrorEditoraA();
      case "acao":
        return new LivroAcaoEditoraA();
      case "misterio":
        return new LivroMisterioEditoraA();
      default:
        return new LivroTerrorEditoraA();
    }
 
  }

   
  
  
}
