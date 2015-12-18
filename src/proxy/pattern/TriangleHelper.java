package proxy.pattern;

public class TriangleHelper implements IShapeHelper {
	
	public TriangleHelper(String path) {
		loadShapeImage(path);
	}

	@Override
	public void renderShape() {
		System.out.println("Render Triangle");
	}

	private void loadShapeImage(String path) {
		System.out.println("Load Triangle from " + path);
	}

}
