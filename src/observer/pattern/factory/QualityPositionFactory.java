package observer.pattern.factory;

import observer.pattern.position.IPosition;
import observer.pattern.position.PositionType;
import observer.pattern.position.QualityPosition;

public class QualityPositionFactory implements IPositionFactory{

	private IPosition jobPosition = null;

	@Override
	public IPosition create(PositionType type) {
		jobPosition = new QualityPosition(type);
		System.out.println(type.getName() + " is created by factory");
		return jobPosition;
	}
}
