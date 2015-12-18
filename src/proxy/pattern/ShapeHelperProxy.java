package proxy.pattern;

public class ShapeHelperProxy implements IShapeHelper {
	private String path;
	private ShapeType type;

	public ShapeHelperProxy(String path, ShapeType type) {
		this.path = path;
		this.type = type;
	}

	@Override
	public void renderShape() {
		IShapeHelper shapeHelper = null;
		
		switch (type.getName()) {
		case "Triangle":
			shapeHelper = new TriangleHelper(path);
			break;
		case "Circle":
			shapeHelper = new CircleHelper(path);
		default:
			break;
		}

		shapeHelper.renderShape();
	}
}
