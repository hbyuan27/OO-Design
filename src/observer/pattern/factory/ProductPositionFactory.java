package observer.pattern.factory;

import observer.pattern.position.IPosition;
import observer.pattern.position.PositionType;
import observer.pattern.position.ProductPosition;

public class ProductPositionFactory implements IPositionFactory{

	private IPosition jobPosition = null;

	@Override
	public IPosition create(PositionType type) {
		jobPosition = new ProductPosition(type);
		System.out.println(type.getName() + " is created by factory");
		return jobPosition;
	}
}
