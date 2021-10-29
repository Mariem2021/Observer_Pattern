import java.util.List;
import java.util.ArrayList;

class Theme {
    private List<Observer> observers = new ArrayList<Observer>();
    private int State;

    public int getState() {
        return state;
    } 

    public void setState(int state) {
        this.state = state;
        notifyTokObserver();
    }

    public void attach (Observer observer) {
        observers.add(observer);
    }

    public void notifyTokObserver() {
        for(Observer observer : observers)
        observer.modifier();
    }
}
