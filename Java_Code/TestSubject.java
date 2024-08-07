import java.util.ArrayList;
import java.util.List;

public class TestSubject {
    private List<Observer> observers = new ArrayList<>();
    private String result;
    
    public void addObserver(Observer observer) {
        observers.add(observer);
    }
    
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }
    
    public void setResult(String result) {
        this.result = result;
        notifyAllObservers();
    }
    
    private void notifyAllObservers() {
        for (Observer observer : observers) {
            observer.update(result);
        }
    }
}
