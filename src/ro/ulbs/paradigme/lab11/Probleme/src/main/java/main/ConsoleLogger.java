package ro.ulbs.paradigme.lab11.Probleme.src.main.java.main;
import java.util.Observable;
import java.util.Observer;


// TODO make this class Observer, by implementing java.util.Observer interface
public class ConsoleLogger implements Observer {

    // TODO upon each notification, print to console
    @Override
    public void update(Observable o, Object arg) {
        System.out.println("ConsoleLogger: " + arg.toString());
    }

}
