package ood.position;

public enum PositionType {
	JAVADEV("Dev", "JavaDev"),
	TESTING("Quality", "Testing"),
	PM("Manager", "ProductManager");

	private final String category;
	private final String name;

	PositionType(String category, String name) {
		this.category = category;
		this.name = name;
	}

	public String getCategory() {
		return category;
	}

	public String getName() {
		return name;
	}
}