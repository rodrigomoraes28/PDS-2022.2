package Observer;

public class Client implements IObserver{

    String name;

    public Client(String name) {
        this.name = name;
    }

    @Override
    public void update(String fornada) {
        System.out.println("Meu nome é: " + name + " e essa fornada das " + fornada + " tá uma delícia!");
    }

}
