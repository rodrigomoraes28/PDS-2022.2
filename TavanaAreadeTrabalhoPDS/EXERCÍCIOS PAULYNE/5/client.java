import Observable.IObservable;
import Observable.Padaria;
import Observer.Client;

public class client {
    public static void main(String[] args) {

        Padaria observable = new Padaria();
        observable.addObserver(new Client("Claudio"));
        observable.addObserver(new Client("Jeffin"));

        observable.novaFormada("Formada das 11");

    }
}
