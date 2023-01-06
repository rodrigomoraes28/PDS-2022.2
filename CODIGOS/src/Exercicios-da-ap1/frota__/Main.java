public class Main {
  
  public static void main(String[] args) {

    Veiculo veic = new Carro("34555");
    System.out.println(veic);
    Frota frotinha = new Frota();
    Funcionario func = new Funcionario("Rodrigo", "gerente");
    frotinha.setGerente(func);
    frotinha.adicionaVeiculo("134569", "Caminhao", func);
    System.out.println(frotinha.leNumeroRodas());

  }
}
