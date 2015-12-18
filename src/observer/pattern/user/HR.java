package observer.pattern.user;

import observer.pattern.observer.IObserver;

public class HR implements IUser, IObserver{
	
	String userName;
	
	public HR(String userName) {
		this.userName = userName;
		System.out.println("HR is ready: " + this.userName);
	}

	@Override
	public String getUserName() {
		return this.userName;
	}

	@Override
	public void update(String message) {
		System.out.println("To HR " + this.userName + ": " + message);
	}

}