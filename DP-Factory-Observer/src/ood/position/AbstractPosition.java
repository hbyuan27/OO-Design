package ood.position;

import java.util.ArrayList;
import java.util.List;

import ood.observer.IObserver;
import ood.user.Candidate;
import ood.user.HR;
import ood.user.Manager;

public class AbstractPosition implements IPosition {

	private PositionType type;
	private Manager manager;
	private HR hr;
	private List<IObserver> observerList = new ArrayList<IObserver>();

	public AbstractPosition(PositionType type) {
		this.type = type;
	}

	@Override
	public String getName() {
		return type.getName();
	}

	@Override
	public String getCategory() {
		return type.getCategory();
	}

	@Override
	public Manager getManager() {
		return this.manager;
	}

	@Override
	public HR getHR() {
		return this.hr;
	}

	@Override
	public void setManager(Manager manager) {
		this.manager = manager;
		System.out.println("The manager of position " + this.getName() + " is " + manager.getUserName());
	}

	@Override
	public void setHR(HR hr) {
		this.hr = hr;
		System.out.println("The HR of position " + this.getName() + " is " + hr.getUserName());
	}

	@Override
	public void attach(IObserver observer) {
		this.observerList.add(observer);
	}

	@Override
	public void detach(IObserver observer) {
		if (this.observerList.contains(observer)) {
			this.observerList.remove(observer);
		}
	}

	@Override
	public void sendNotification(String message) {
		for (IObserver o : observerList) {
			o.update(message);
		}
	}

	@Override
	public void processApplication(Candidate candidate) {
		attach(getManager());
		attach(getHR());
		sendNotification(candidate.getUserName() + " is applying position: " + this.getName());
	}
}
