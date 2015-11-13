package ood.position.factory.simple;

import ood.position.DevPosition;
import ood.position.IPosition;
import ood.position.PositionType;
import ood.position.ProductPosition;
import ood.position.QualityPosition;

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
