package ood.position.factory;

import ood.position.IPosition;
import ood.position.PositionType;
import ood.position.QualityPosition;

public class QualityPositionFactory implements IPositionFactory{

	private IPosition jobPosition = null;

	@Override
	public IPosition create(PositionType type) {
		jobPosition = new QualityPosition(type);
		System.out.println(type.getName() + " is created by factory");
		return jobPosition;
	}
}
