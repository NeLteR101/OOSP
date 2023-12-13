import java.util.ArrayList;
import java.util.List;

class TaskManager implements Subject {
    private List<Observer> observers = new ArrayList<>();
    private String taskName;

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String taskName) {
        for (Observer observer : observers) {
            observer.update(taskName);
        }
    }

    public void addTask(String taskName) {
        this.taskName = taskName;
        notifyObservers(taskName);
    }
}