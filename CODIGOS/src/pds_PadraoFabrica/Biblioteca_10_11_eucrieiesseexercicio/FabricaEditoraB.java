public class FabricaEditoraB implements IFabricaLivro{

  @Override
  public ILivro criarLivro(String tipo){

    switch(tipo){
      case "terror":
        return new LivroTerrorEditoraB();
      case "acao":
        return new LivroAcaoEditoraB();
      case "misterio":
        return new LivroMisterioEditoraB();
      default:
        return new LivroTerrorEditoraB();
    }
   }

  
  
}
