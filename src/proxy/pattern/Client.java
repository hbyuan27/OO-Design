package proxy.pattern;

public class Client {
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		// assume our business case is to select one shape in shape name list and render it.
		
		// case 1: do not use proxy
		// we have to load all shapes into memory, because we doesn't know which shape will be selected by end user
		System.out.println("********** Without Proxy **********");
		TriangleHelper triHelper1 = new TriangleHelper("Test Triangle File Path 1");
		TriangleHelper triHelper2 = new TriangleHelper("Test Triangle File Path 2");
		CircleHelper circleHelper = new CircleHelper("Test Circle File Path");
		// end user selected triangle 1. So the other shape is loaded but not used. Kind of waste
		triHelper1.renderShape();
		
		System.out.println("********** Use Proxy **********");
		// end user select Circle shape, we load it and render it via proxy
		ShapeHelperProxy shapeProxy = new ShapeHelperProxy("Test Circle File Path 1", ShapeType.CIRCLE);
		shapeProxy.renderShape();
	}

}
