package ood.position.factory;

import ood.position.DevPosition;
import ood.position.IPosition;
import ood.position.PositionType;

public class DevPositionFactory implements IPositionFactory {

	private IPosition jobPosition = null;

	@Override
	public IPosition create(PositionType type) {
		jobPosition = new DevPosition(type);
		System.out.println(type.getName() + " is created by factory");
		return jobPosition;
	}

}
