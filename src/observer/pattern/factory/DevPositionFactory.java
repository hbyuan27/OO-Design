package observer.pattern.factory;

import observer.pattern.position.DevPosition;
import observer.pattern.position.IPosition;
import observer.pattern.position.PositionType;

public class DevPositionFactory implements IPositionFactory {

	private IPosition jobPosition = null;

	@Override
	public IPosition create(PositionType type) {
		jobPosition = new DevPosition(type);
		System.out.println(type.getName() + " is created by factory");
		return jobPosition;
	}

}
