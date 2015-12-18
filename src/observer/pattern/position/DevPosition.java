package observer.pattern.position;

import java.util.List;

public class DevPosition extends AbstractPosition {

	/**
	 * Required Programming Language
	 */
	private List<String> requiredPLs;

	public DevPosition(PositionType type) {
		super(type);
	}

	public List<String> getRequiredPLs() {
		return requiredPLs;
	}

	public void addRequiredPL(String requiredPL) {
		this.requiredPLs.add(requiredPL);
	}
}
