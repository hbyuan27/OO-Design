package observer.pattern.factory.simple;

import observer.pattern.position.DevPosition;
import observer.pattern.position.IPosition;
import observer.pattern.position.PositionType;
import observer.pattern.position.ProductPosition;
import observer.pattern.position.QualityPosition;

public class PositionSimpleFactory {
	
	private static IPosition position = null;
	
	public static IPosition create(PositionType type) {
		switch (type) {
		case JAVADEV:
			position = new DevPosition(type);
			System.out.println(type.getName() + " is created by simple factory");
			break;
		case TESTING:
			position = new QualityPosition(type);
			System.out.println(type.getName() + " is created by simple factory");
			break;
		case PM:
			position = new ProductPosition(type);
			System.out.println(type.getName() + " is created by simple factory");
			break;
		default:
			break;
		}
		return position;
	}

}
