import java.util.ArrayList;
import java.util.List;

public class LojaRoupas implements Subject {
    private List<Observer> observers = new ArrayList<>();
    private List<Roupa> roupa = new ArrayList<>();

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void notifyObservers(List<Roupa> roupas) {
        for (Observer observer : observers) {
            observer.update(roupas);
        }
    }

    public void addRoupa(Roupa r) {
        roupa.add(r);
        notifyObservers(roupa);
    }

    public Roupa buscarRoupa(Roupa roupa) {
        return roupa;
    }
}
