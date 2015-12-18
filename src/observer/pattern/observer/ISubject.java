package observer.pattern.observer;

public interface ISubject {
	void attach(IObserver observer);
	void detach(IObserver observer);
	void sendNotification(String message);
}
