package ood.user;

import java.util.ArrayList;
import java.util.List;

import ood.position.IPosition;

public class Candidate implements IUser {

	String userName;
	List<String> skills = new ArrayList<String>();

	public Candidate(String userName) {
		this.userName = userName;
		System.out.println("Candidate is ready: " + this.userName);
	}

	public List<String> getSkills() {
		return skills;
	}

	public void addSkill(String skill) {
		this.skills.add(skill);
	}

	@Override
	public String getUserName() {
		return this.userName;
	}

	public void applyPosition(IPosition position) {
		position.processApplication(this);
	}
}
