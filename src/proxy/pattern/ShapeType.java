package proxy.pattern;

public enum ShapeType {
	TRIANGLE("Triangle"),
	CIRCLE("Circle");

	private String name;

	private ShapeType(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
}
