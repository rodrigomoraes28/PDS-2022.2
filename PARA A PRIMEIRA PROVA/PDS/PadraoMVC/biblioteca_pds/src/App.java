import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Interface interface1 = new Interface();
        Scanner sc = new Scanner(System.in);

        boolean sair = false;
        while(!sair){
            System.out.println("1. Cadastrar; 2. Visualizar; 3. Sair");
            int opcao = sc.nextInt();

            sc.nextLine();
            if(opcao == 1){
                interface1.cadastrarLivro(sc);
            }else if(opcao == 2){
                interface1.visualizarLivros();
            } else if(opcao == 3) {
                sc.close();       
                sair = true;
            } else {
                System.out.println("opcao invalida");
            }
            
       }

    }
}
