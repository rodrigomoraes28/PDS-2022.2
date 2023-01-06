public class Moto extends Veiculo {



   public Moto(String chassi) { // o porque disso? eu nao sei, mas chuto que eh pq como a classe moto esta inicializando um construtor de uma classe pai (Veiculo) precisa do super(nomeparametro)
      super(chassi);
      this.rodas = 2;
   }
}
