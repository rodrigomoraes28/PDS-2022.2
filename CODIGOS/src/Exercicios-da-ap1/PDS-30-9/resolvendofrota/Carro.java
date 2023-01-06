public class Carro extends Veiculo{
    //extends eh o filho (antes do extends) que pega do pai (depois de extends)
    //implements é de interface, a classe que estou implementando os metodos da inteface usa o implements
    public Carro(String chassi){
        super(chassi);
        this.numRodas = 4;
    }
    
}