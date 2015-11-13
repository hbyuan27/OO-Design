package ood.position;

import ood.observer.ISubject;
import ood.user.Candidate;
import ood.user.HR;
import ood.user.Manager;

public interface IPosition extends ISubject {
	String getName();

	String getCategory();

	void setManager(Manager manager);

	void setHR(HR hr);

	Manager getManager();

	HR getHR();

	void processApplication(Candidate candidate);
}
