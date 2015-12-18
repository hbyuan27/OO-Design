package observer.pattern.factory;

import observer.pattern.position.IPosition;
import observer.pattern.position.PositionType;

public interface IPositionFactory {

	IPosition create(PositionType type);
}
