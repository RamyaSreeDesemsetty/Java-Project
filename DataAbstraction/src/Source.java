
public class Source {

	public static void main(String[] args) {
		Shapes rect = new Rectangle(4,5);
		rect.draw();
		rect.calculateArea();
		rect.method1();
		Shapes circ = new Circle(4);
		circ.calculateArea();
		circ.draw();

	}

}
