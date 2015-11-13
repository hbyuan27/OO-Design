package ood.position.factory;

import ood.position.IPosition;
import ood.position.PositionType;

public interface IPositionFactory {

	IPosition create(PositionType type);
}
