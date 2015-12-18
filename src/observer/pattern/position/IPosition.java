package observer.pattern.position;

import observer.pattern.observer.ISubject;
import observer.pattern.user.Candidate;
import observer.pattern.user.HR;
import observer.pattern.user.Manager;

public interface IPosition extends ISubject {
	String getName();

	String getCategory();

	void setManager(Manager manager);

	void setHR(HR hr);

	Manager getManager();

	HR getHR();

	void processApplication(Candidate candidate);
}
