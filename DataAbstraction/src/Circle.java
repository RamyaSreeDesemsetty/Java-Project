
public class Circle extends Shapes{
	int r;
	double pi=3.14;
	public Circle(int r) {
		this.r=r;
	}
 public void draw() {
	 System.out.println("Circle is drawn");
 }
 public void calculateArea()
 {
	 System.out.println(pi*r*r);
 }
}
