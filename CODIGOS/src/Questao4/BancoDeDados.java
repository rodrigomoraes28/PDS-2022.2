package Questao4;

//na new poe o BancoDeDados.getInstance , nao da new nao

public class BancoDeDados {

  static BancoDeDados bd;

  private BancoDeDados(){

  }

  public static BancoDeDados getinstance(){
    return new BancoDeDados();
  }


  ArrayList<Usuario> usuario;


  public void salvarUsuario(Usuario novoUsuario){
    this.usuario.add(novoUsuario);
    System.out.println("Novo Usuario adicionado: "+ novoUsuario.getNome() + "/n" + getIdade());
   }

  
  public void deletar(Usuario usuarioDeletado){
    this.usuario.remove(usuarioDeletado);
    System.out.println("Usuario removido: "+ usuarioDeletado.getNome() + "/n" + getIdade());
   }
   
}
