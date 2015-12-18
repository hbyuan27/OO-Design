package observer.pattern.position;

import java.util.List;

public class QualityPosition extends AbstractPosition{

	private List<String> requiredTools;

	public QualityPosition(PositionType type) {
		super(type);
	}

	public List<String> getRequiredTools() {
		return requiredTools;
	}

	public void addRequiredTools(String requiredTool) {
		this.requiredTools.add(requiredTool);
	}
}
