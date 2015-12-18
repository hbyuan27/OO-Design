package observer.pattern.position;

import java.util.List;

public class ProductPosition extends AbstractPosition {
	
	/**
	 * Required Business Unit knowledge
	 */
	private List<String> requiredBUs;

	public ProductPosition(PositionType type) {
		super(type);
	}

	public List<String> getRequiredBUs() {
		return requiredBUs;
	}

	public void addRequiredPL(String requiredBU) {
		this.requiredBUs.add(requiredBU);
	}
}
