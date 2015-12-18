package proxy.pattern;

public class CircleHelper implements IShapeHelper {

	public CircleHelper(String path) {
		loadShapeImage(path);
	}
	
	@Override
	public void renderShape() {
		System.out.println("Render Circle");
	}

	private void loadShapeImage(String path) {
		System.out.println("Load Circle from " + path);
	}
}
