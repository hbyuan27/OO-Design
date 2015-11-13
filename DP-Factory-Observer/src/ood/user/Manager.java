package ood.user;

import ood.observer.IObserver;

public class Manager implements IUser, IObserver{
	
	String userName;
	
	public Manager(String userName) {
		this.userName = userName;
		System.out.println("Manager is ready: " + this.userName);
	}

	@Override
	public String getUserName() {
		return this.userName;
	}
	
	@Override
	public void update(String message) {
		System.out.println("To Manager " + this.userName + ": " + message);
	}
}