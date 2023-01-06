public class FabricaVeiculo{

    public static Veiculo criaVeiculo(String chassi, String tipo){
        Veiculo veiculo = null;
        
        switch(tipo){
            case "Caminhao": veiculo = new Caminhao(chassi);
                break;
            case "Carro": veiculo = new Carro(chassi);
                break;
            case "Moto": veiculo = new Moto(chassi);
                break;
            
        }
        return veiculo;
        
    }

}