package vendocomofaz.Cobertura;
import vendocomofaz.Interfaces.ICobertura;
import vendocomofaz.Interfaces.ISobremesa;


public abstract class CoberturaGenerica implements ICobertura{


  public float preco;
  public ISobremesa sobremesa;

  public CoberturaGenerica(ISobremesa sobremesa_ex){
    this.sobremesa = sobremesa_ex;
  }


  public float lePreco(){ //esse metodo chamado sobremesa.lePreco é implementado do ISobremesa, se vc tira o lePreco do ISobremesa da erro
    return this.preco + sobremesa.lePreco(); //tipo uma recursao essa porra aqui, pega o preço do float dele e tb soma com o proximo sobremesa+lePreco ate percorrer todos, assim no final o lePreco pega o valor de cada um, genial     
  }


  //pelo que entendi todos this.preco se somam em um só porque o pai deles é o CoberturaGenerica e os filhos são o CaldaDeCaupiry,CaldaDeChocolate e CaldaDeMorango, dae todos os this.preco se somam para o pai devolta qnd usa a funcao lePreco (que tem o return this.perco + sobremesa.lePreco()) que é propia da classe abstrata CoberturGenerica

  //o sobremesa.lePreco que é exclusivo do ISobremesa
  
}
