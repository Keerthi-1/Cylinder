
public class Cylinder {
	
	Rectangle rectangle;
	Circle circle;
	
	
	public double areaCylinder(double radius,int height) {
		
		double area;
		rectangle = new Rectangle(radius,height);
		circle = new Circle(radius);
		
		area = rectangle.area() + 2 * circle.area();
		
		return area;
		
		
		
		
	}

}
