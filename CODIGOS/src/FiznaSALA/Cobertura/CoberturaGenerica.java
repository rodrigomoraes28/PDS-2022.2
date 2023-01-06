package Cobertura;
import Interfaces.ICobertura;
import Interfaces.ISorvete;

//CoberturaGenerica seria tipo a border
public abstract class CoberturaGenerica implements ICobertura{  
 

  float preco;
  ISorvete sorvete; //aqui é tipo o window

  //a ideia do construtor é pra n ter q fazer isso toda vez ou nao , esqueci agr

  //perguntar se a professora Paulyne sabe pra que serve isso mesmo porque eu me esqueci

  //ah, acho que é pra nao ter que por this.sorvete = sorvete_ex toda hora, ae faz so o super implementation la
  //e apenas o preço que voce escreve nas outra classes que extendem a CoberturaGenerica 
  public CoberturaGenerica(ISorvete sorvete_ex){
    this.sorvete = sorvete_ex;
  }


  public float lePreco(){
    return this.preco + sorvete.lePreco();
  }


  /**
  @Override
  public String nomeSaborSorvete(){
    return "Chocolate";
  }

  @Override
  public float temperaturaSorvete(){
    return 0.5f;
  }

   */
  
}
